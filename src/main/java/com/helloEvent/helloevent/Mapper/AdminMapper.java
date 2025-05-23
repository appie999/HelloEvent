package com.helloEvent.helloevent.Mapper;



import com.helloEvent.helloevent.dto.AdminDto;
import com.helloEvent.helloevent.entity.Admin;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AdminMapper {

    AdminDto toDto(Admin admin);
    Admin toEntity(AdminDto adminDto);
}
