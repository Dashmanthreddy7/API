package pojo;

import java.util.List;

public class Listusers {
	private String page;
	private String per_page;
	private String total;
	private String total_pages;
	private List<data> data;
    private Support support;
    
	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getTotal_pages() {
		return total_pages;
	}

	public void setTotal_pages(String total_pages) {
		this.total_pages = total_pages;
	}

	public List<data> getData() {
		return data;
	}

	public void setData(List<data> data) {
		this.data = data;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getPer_page() {
		return per_page;
	}

	public void setPer_page(String per_page) {
		this.per_page = per_page;
	}

	/**
	 * @return the support
	 */
	public Support getSupport() {
		return support;
	}

	/**
	 * @param support the support to set
	 */
	public void setSupport(Support support) {
		this.support = support;
	}

}
