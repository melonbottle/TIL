package spring_mybatis;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("service")
public class EmpServiceImpl implements EmpService {
	@Autowired
	EmpDAO dao;

	public void setDao(EmpDAO dao) {
		this.dao = dao;
	}

	@Override
	public EmpVO getOneEmp(int employee_id) {
		return dao.getOneEmp(employee_id);
	}

	@Override
	public List<EmpVO> getAllEmp() {
		return dao.getAllEmp();
	}

	@Override
	public List<EmpVO> getPagingEmp(int[] rownum) {
		return dao.getPagingEmp(rownum);
	}

	@Override
	public void registerEmp(EmpVO vo) {
		if(vo.getLast_name() != null) {
			EmpVO vo2 = dao.checkEmp(vo);
			String job_id = dao.checkJob(vo);
			if(vo2 == null && job_id != null) {
				dao.insertEmp(vo);
			}
		}
	}

//	@Override
//	public void insertEmp(EmpVO vo) {
//		dao.insertEmp(vo);
//	}
//
//	@Override
//	public void updateEmp(EmpVO vo) {
//		dao.updateEmp(vo);
//	}
//
//	@Override
//	public void deleteEmp(int employee_id) {
//		dao.deleteEmp(employee_id);
//	}
//
//	@Override
//	public List<EmpVO> getPageEmp(int[] nums) {
//		return dao.getPageEmp(nums);
//	}
//
//	@Override
//	public void insertEmp2(EmpVO vo) {
//		dao.insertEmp2(vo);
//	}
//
//	@Override
//	public List<EmpVO> getEmpDept(List<Integer> deptlist) {
//		return dao.getEmpDept(deptlist);
//	}
//
//	@Override
//	public void updateEmpMap(Map<String, String> map) {
//		dao.updateEmpMap(map);
//	}

}
