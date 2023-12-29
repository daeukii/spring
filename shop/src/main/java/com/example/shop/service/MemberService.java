package com.example.shop.service;

import com.example.shop.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public void joinMember(Member member){
        // 처리할 모든 비즈니스는 여기에서

        memberRepository.saveMember(member);
    }
}
