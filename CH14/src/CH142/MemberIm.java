package CH142;
//pc와 모바일 메서드 모두 구현
public class MemberIm implements MemberPC, MemberMoblie{
	@Override
	public void joinMember()
	{
		System.out.println("PC에서 회원 가입 합니다");
	}
	@Override
	public void searchMember()
	{
		System.out.println("PC에서 회원 조회 합니다");
	}
	@Override
	public void modMember()
	{
		System.out.println("PC에서 회원 수정 합니다");
	}
	@Override
	public void delMember()
	{
		System.out.println("PC에서 회원 삭제 합니다");
	}
	@Override
	public void joinMemberMobile()
	{
		System.out.println("모바일에서 회원 가입 합니다");
	}
	@Override
	public void searchMemberMobile()
	{
		System.out.println("모바일에서 회원 조회 합니다");
	}
	@Override
	public void modMemberMobile()
	{
		System.out.println("모바일에서 회원 수정 합니다");
	}
	@Override
	public void delMemberMobile()
	{
		System.out.println("모바일에서 회원 삭제 합니다");
	}

}
