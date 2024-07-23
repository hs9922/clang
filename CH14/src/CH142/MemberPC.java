package CH142;
//PC회원 기능 메서드를 선언한 인터페이스
public interface MemberPC {
	//회원가입, 회원조회, 수정, 삭제
	public abstract void joinMember();
	public abstract void searchMember();
	public abstract void modMember();
	public abstract void delMember();
}
