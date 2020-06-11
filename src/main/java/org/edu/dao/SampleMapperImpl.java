package org.edu.dao;
import java.util.List;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.edu.vo.MemberVO;

public class SampleMapperImpl implements IF_SampleMapper {
	@Inject
	private SqlSession sqlSession;
	//오버라이드-다형성(형태가 다양하다)
	@Override
	public void insertMember(MemberVO vo) {
		// IF_SampleMapper에 있는것을 오버라이드(재정의)해서 여기서 쓰는거
		sqlSession.insert("org.edu.dao.IF_SampleMapper", vo); 
		//insert쿼리넣어주는(이름만바꾸면사용가능) ,vo있어서 매개변수(vo넣음)있는걸로
	}

	@Override
	public List<MemberVO> selectMember() {
		return sqlSession.selectList("org.edu.dao.IF_SampleMapper"); //void 아닌 list형이라 리턴값있음.
	}

	@Override
	public void updateMember(MemberVO vo) {
		sqlSession.update("org.edu.dao.IF_SampleMapper", vo); //매개변수로 클릭, 오버로드한것
	}

	@Override
	public void deleteMember(String userid) {
		sqlSession.delete("org.edu.dao.IF_SampleMapper", userid);
	}

	@Override
	public String getTime() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUname(String uid, String upw) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUserId(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String searchUname(String type, String keyword) {
		// TODO Auto-generated method stub
		return null;
	} 

}
