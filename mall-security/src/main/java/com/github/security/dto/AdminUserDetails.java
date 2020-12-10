package com.github.security.dto;

import com.github.model.UmsAdmin;
import com.github.model.UmsResource;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author yuzhuangzhuang
 * @create 2020/12/10 17:07
 */
public class AdminUserDetails implements UserDetails {

    private final UmsAdmin umsAdmin;
    private final List<UmsResource> umsResourceList;

    public AdminUserDetails(UmsAdmin umsAdmin, List<UmsResource> umsResourceList) {
        this.umsAdmin = umsAdmin;
        this.umsResourceList = umsResourceList;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return umsResourceList.stream()
                .map(umsResource -> new SimpleGrantedAuthority(umsResource.getId()+":"+umsResource.getName()))
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return umsAdmin.getPassword();
    }

    @Override
    public String getUsername() {
        return umsAdmin.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return umsAdmin.getStatus().equals(1);
    }
}
