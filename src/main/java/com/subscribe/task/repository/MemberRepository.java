package com.subscribe.task.repository;

import com.subscribe.task.dto.user.FindMemberDTO;
import com.subscribe.task.dto.user.SaveUserDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberRepository {
    List<FindMemberDTO> findAll();
    void save(SaveUserDTO saveUserDTO);
    FindMemberDTO findByLoginId(String loginId);
}
