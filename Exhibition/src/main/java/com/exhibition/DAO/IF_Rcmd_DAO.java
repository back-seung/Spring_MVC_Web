package com.exhibition.DAO;

import java.util.List;

import com.exhibition.VO.Paging_VO;
import com.exhibition.VO.Rcmd_VO;

public interface IF_Rcmd_DAO {

	public void insert(Rcmd_VO rcmdVO) throws Exception;

	public int rcmdCnt() throws Exception;

	public List<Rcmd_VO> selectAll(Paging_VO pagingVO) throws Exception;

	public void updateCnt(int rcNo) throws Exception;

	public Rcmd_VO selectOne(int rcNo) throws Exception;

	public void updateRcmd(Rcmd_VO rcmdVO) throws Exception;

	public void deleteRcmd(int rcNo) throws Exception;

	public List<Rcmd_VO> selectTop3(Rcmd_VO rcmdVO) throws Exception;

	public List<Rcmd_VO> getSearchList(Rcmd_VO searchVO) throws Exception;

}
