package page;

public class PageHandler2 {
	int currentPage;
	int totRecords;
	int pageSize;
	int grpSize;
	
	int totalPage;
	int currentgrp;
	int grpStartPage;
	int grpEndPage;
	
	

	
	public PageHandler2(int currentPage, int totRecords, int pageSize, int grpSize) {
		super();
		this.currentPage = currentPage;
		this.totRecords = totRecords;
		this.pageSize = pageSize;
		this.grpSize = grpSize;
		calPage();
	}

	private void calPage() {

		int remain =totRecords % pageSize;
		if(remain==0) {
			totalPage=totRecords/pageSize;
			
		}else {
			totalPage = totRecords/pageSize+1;
		}
		int remain2 = currentPage % grpSize;
		if(remain2==0) {
			currentgrp=currentPage/grpSize;
			
		}else {
			currentgrp=currentPage/grpSize+1;
		}
		
		grpStartPage = (currentgrp-1 )* grpSize+1;
		grpEndPage = currentgrp*grpSize;

		if(grpEndPage> totalPage) {
			grpEndPage=totalPage;
					
		}
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public int getTotRecords() {
		return totRecords;
	}

	public int getPageSize() {
		return pageSize;
	}

	public int getGrpSize() {
		return grpSize;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public int getCurrentgrp() {
		return currentgrp;
	}

	public int getGrpStartPage() {
		return grpStartPage;
	}

	public int getGrpEndPage() {
		return grpEndPage;
	}
	public static void main(String[] args) {
		PageHandler2 h = new PageHandler2(4,15,5,3);
		h.getTotalPage(); //9
		h.getCurrentgrp(); //2
		h.getGrpStartPage();//6
		h.getGrpEndPage();//9
	System.out.println(h.getTotalPage());
	System.out.println(h.getCurrentgrp());
	System.out.println(h.getGrpStartPage());
	System.out.println(h.getGrpEndPage());
	}
	
	
}
