package cn.easyproject.easyee.sm.cmsmoudle.service;

import java.util.List;
import java.io.Serializable;

import org.springframework.transaction.annotation.Transactional;

import cn.easyproject.easyee.sm.cmsmoudle.criteria.SliderCriteria;
import cn.easyproject.easyee.sm.cmsmoudle.entity.Slider;
import cn.easyproject.easyee.sm.base.pagination.PageBean;

/**
 * Slider Service, generated by EasyAuto
 * @author easyproject.cn
 * @version 1.0
 *
 */
@Transactional
public interface SliderService {
	
	/**
	 * Save
	 * @param o Object
	 */
	public void save(Slider o);
	
	/**
	 * Delete Object
	 * @param id oid
	 */
	public void delete(Serializable id);
	/**
	 * Delete All
	 * @param values oids
	 */
	public void delete(String[] values);
	/**
	 * Update
	 * @param o
	 */
	public void update(Slider o);
	
	/**
	 * Get
	 * @param id oid
	 * @return Object
	 */
	@Transactional(readOnly=true)
	public Slider get(Serializable id);
	
	/**
	 * Pagination
	 * @param pageBean PageBean
	 * @param empCriteria Criteria
	 */
	@Transactional(readOnly=true)
	@SuppressWarnings("rawtypes")
	public void findByPage(PageBean pageBean,SliderCriteria sliderCriteria);
	
	/**
	 * Max Page
	 * @param rowPerPage Row Per Page
	 * @return maxPage
	 */
	@Transactional(readOnly=true)
	public int findMaxRow();
	
	/**
	 * Max Page
	 * @param rowPerPage Row Per Page
	 * @return maxPage
	 */
	@Transactional(readOnly=true)
	public int findMaxPage(int rowsPerPage);
	
	/**
	 * Find All
	 * @return list 
	 */
	@Transactional(readOnly=true)
	public List<Slider> findAll();
	
}
