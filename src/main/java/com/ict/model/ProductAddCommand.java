package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.db.DAO;
import com.ict.db.ShopVO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class ProductAddCommand implements Command{
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
	
		try {
			String path = request.getServletContext().getRealPath("images");
			MultipartRequest mr = new MultipartRequest(
					request,path, 100*1024*1024, "utf-8", new DefaultFileRenamePolicy());
			ShopVO vo = new ShopVO();
			vo.setCategory(mr.getParameter("category"));
			vo.setP_num(mr.getParameter("p_num"));
			vo.setP_name(mr.getParameter("p_name"));
			vo.setP_company(mr.getParameter("p_company"));
			vo.setP_price(Integer.parseInt(mr.getParameter("p_price")));
			vo.setP_saleprice(Integer.parseInt(mr.getParameter("p_saleprice")));
			vo.setP_content(mr.getParameter("p_content"));
			
			// 이미지 처리 
			if(mr.getFile("p_image_s") != null) {
				vo.setP_image_s(mr.getFilesystemName("p_image_s"));
			}else {
				vo.setP_image_s("");
			}
			if(mr.getFile("p_image_l") != null) {
				vo.setP_image_l(mr.getFilesystemName("p_image_l"));
			}else {
				vo.setP_image_l("");
			}
			
			int result = DAO.getProductInsert(vo);
			
			return "MyController?cmd=list";
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
}
