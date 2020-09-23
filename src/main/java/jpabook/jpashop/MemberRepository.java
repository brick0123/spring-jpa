package jpabook.jpashop;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(Member member) {
        em.persist(member);
        return member.getId();
        // member를 반환하지 않고 id만 반환하는 이유
        // 커멘드랑 쿼리를 분리하기 위해
    }

    public Member find(Long id) {
        return em.find(Member.class, id);
    }

}
