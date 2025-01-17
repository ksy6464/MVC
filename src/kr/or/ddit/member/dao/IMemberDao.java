package kr.or.ddit.member.dao;

import java.time.LocalDate;
import java.util.List;

import kr.or.ddit.member.vo.MemberVO;

///dao만들기 위해서 인터페이스 설계를 먼저했다

/**
 * 실제 DB와 연결해서 SQL문을 수앻하여 결과를 작성해 서비스에
 * 전달하기 위한 DAO Interface
 * @author 10
 *
 */
public interface IMemberDao {
	
//	public int insertMember(String memId,String memTel, String Addr);
//	///갑자기 회원이 취미도 추가 하고 싶다고 하면
//	public int insertMember(String memId,String memTel, String Addr, String[] hobby);
//	///생일 추가할때는 이렇게 이렇게 한다
//	public int insertMember(String memId,String memTel, String Addr, String[] hobby, LocalDate birthday);
//	///매번 추가할때이렇게 하면 어렵다
//	//// 그래서 이거 대신에 VO를 사용하면 거기서만 추가 하면된다
	
	/**
	 * MemberVO에 담겨진 회원정보를 DB에 Insert하기 위한 메서드
	 * @param mv 회원정보를 담은 MemberVO 객체
	 * @return DB작업이 성공하면 1, 실패하면 0 반환됨.
	 */
	public int insertMember(MemberVO mv);
	
	/**
	 * MemberVO에 담겨진 회원정보를 DB에 Update하기 위한 메서드
	 * @param mv 회원정보를 담은 MemberVO 객체
	 * @return DB작업이 성공하면 1, 실패하면 0 반환됨.
	 */
	public int updateMember(MemberVO mv);
	
	/**
	 * 해당 회원이 존재여부를 확인하기 위한 메서드
	 * @param memId 존재여부 확인한기위한 회원ID
	 * @return 해당 회원이 존재한다면 true, 존재하지 않으면 false 리턴함.
	 */
	public boolean chechMember(String memId);
	
	/**
	 * 해당 회원정보를 삭제하기 위한 메서드
	 * @param memId 삭제하고자 하는 회원ID
	 * @return 삭제처리가 성공하면 1, 실패하면 0 반환됨.
	 */
	public int deleteMember(String memId);
	
	/**
	 * DB에 존재하는 모든 회원정보를 가져오기 위한 메서드
	 * @return 모든 회원정보를 담은 List객체
	 */
	public List<MemberVO> getAllMember();


}
