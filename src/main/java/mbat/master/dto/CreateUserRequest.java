package mbat.master.dto;


import lombok.Builder;
import mbat.master.entity.Role;

import java.util.Set;


@Builder
public record CreateUserRequest(
        String name,
        String username,
        String password,
        Set<Role> authorities
){
}