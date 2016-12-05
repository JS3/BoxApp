package com.eci.cosw;

import com.eci.cosw.controller.*;
import com.eci.cosw.model.*;
import com.eci.cosw.stub.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.autoconfigure.security.*;
import org.springframework.context.annotation.*;
import org.springframework.core.annotation.*;
import org.springframework.security.config.annotation.authentication.builders.*;
import org.springframework.security.config.annotation.method.configuration.*;
import org.springframework.security.config.annotation.web.builders.*;
import org.springframework.security.config.annotation.web.configuration.*;
import org.springframework.security.web.csrf.*;
import org.springframework.web.filter.*;
import org.springframework.web.util.*;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import org.springframework.boot.autoconfigure.domain.*;
import org.springframework.security.authentication.*;
import org.springframework.security.core.*;
import org.springframework.security.core.authority.*;

@SpringBootApplication
//@EnableJpaRepositories("com.eci.cosw.repositories")
@EntityScan("com.eci.cosw.model")
public class BoxApp {

    public static void main(String[] args) {
        SpringApplication.run(BoxApp.class, args);
    }

    @Configuration
    @EnableGlobalMethodSecurity(prePostEnabled = true)
    @Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
    protected static class SecurityConfiguration extends WebSecurityConfigurerAdapter {

        UsersStub usersStub = UsuariosController.usersStub;

        @Override
        protected void configure(AuthenticationManagerBuilder builder) throws Exception {

            builder.authenticationProvider(new AuthenticationProvider() {
                @Override
                public Authentication authenticate(Authentication auth) throws AuthenticationException {
                    String name = auth.getName();
                    String pass = auth.getCredentials().toString();
                    Usuario usuario = usersStub.loginUser(name, pass);
                    if (usuario != null) {
                        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
                        authorities.add(new SimpleGrantedAuthority(usuario.getRol()));
                        return new UsernamePasswordAuthenticationToken(name, pass, authorities);
                    }
                    return null;
                }

                @Override
                public boolean supports(Class<?> type) {
                    return type.equals(UsernamePasswordAuthenticationToken.class);
                }
            });
        }

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http
                    .httpBasic()
                    .and()
                    .authorizeRequests()
                    .antMatchers("/app/**", "/logout", "/login", "/users/**").permitAll()
                    .anyRequest().authenticated().and()
                    .logout().logoutSuccessUrl("/")
                    .and().csrf()
                    .csrfTokenRepository(csrfTokenRepository()).and()
                    .addFilterAfter(csrfHeaderFilter(), CsrfFilter.class);
        }

        private Filter csrfHeaderFilter() {
            return new OncePerRequestFilter() {
                @Override
                protected void doFilterInternal(HttpServletRequest request,
                        HttpServletResponse response, FilterChain filterChain)
                        throws ServletException, IOException {
                    CsrfToken csrf = (CsrfToken) request.getAttribute(CsrfToken.class
                            .getName());
                    if (csrf != null) {
                        Cookie cookie = WebUtils.getCookie(request, "XSRF-TOKEN");
                        String token = csrf.getToken();
                        if (cookie == null || token != null
                                && !token.equals(cookie.getValue())) {
                            cookie = new Cookie("XSRF-TOKEN", token);
                            cookie.setPath("/");
                            response.addCookie(cookie);
                        }
                    }
                    filterChain.doFilter(request, response);
                }
            };
        }

        private CsrfTokenRepository csrfTokenRepository() {
            HttpSessionCsrfTokenRepository repository = new HttpSessionCsrfTokenRepository();
            repository.setHeaderName("X-XSRF-TOKEN");
            return repository;
        }

    }

}
