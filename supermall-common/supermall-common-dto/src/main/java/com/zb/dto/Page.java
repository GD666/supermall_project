
package com.zb.dto;

import java.util.List;

/**
 * <p>分页处理类 .</p>
 *
 * @version v1.0
 * @author XX
 * @date Sep 21, 2011
 *
 */
public class Page<T> {
    //当前页数
    private Integer curPage;
    /**
     * 总记录数 .
     */
    private Integer total;
    /**
     * 每页行数 .
     */
    private Integer pageSize;
    /**
     * 页面的总数  .
     */
    private Integer pageCount;

    /**
     * List 集合.
     */
    private List<T> rows;


    /**
     * 总页面数 .
     * @return Integer .
     */
    public Integer getPageCount() {
        this.pageCount = this.total % this.pageSize == 0 ? this.total / this.pageSize : this.total / this.pageSize + 1;
        return pageCount;
    }

    /**
     * @param curPage
     *            the curPage to set
     */
    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
    /**
     * @param pageSize
     *            the pageSize to set
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * @param rowCount
     *            the rowCount to set
     */
    public void setRowCount(Integer rowCount) {
        this.total = rowCount;
    }


    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getCurPage() {
        return curPage;
    }

    public void setCurPage(Integer curPage) {
        this.curPage = curPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }
}
