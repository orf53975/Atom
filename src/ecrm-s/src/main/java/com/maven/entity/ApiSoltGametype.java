package com.maven.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Model class of api_solt_gametype.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class ApiSoltGametype implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** lsh. */
	private Integer lsh;

	/** biggametype. */
	private String biggametype;

	/** enname. */
	private String enname;

	/** cnname. */
	private String cnname;

	/** trname. */
	private String trname;

	/** japname. */
	private String japname;

	/** krname. */
	private String krname;

	/** stype. */
	private String stype;
	
	/** category. */
	private String category;

	/** category2. */
	private String category2;

	/** category3. */
	private String category3;

	/** imagename. */
	private String imagename;

	/** gamecodeweb. */
	private String gamecodeweb;

	/** gamecodeh5. */
	private String gamecodeh5;

	/** isweb. */
	private String isweb;//0=支持 1=不支持

	/** ish5. */
	private String ish5;//0=支持 1=不支持

	/** remark. */
	private String remark;

	/** createtime. */
	private Date createtime;
	
	private String ord;//排序号，升幂
	

	/**
	 * Constructor.
	 */
	public ApiSoltGametype() {
	}
	public ApiSoltGametype(String biggametype,String isweb,String ish5) {
		this.biggametype = biggametype;
		this.isweb = isweb;
		this.ish5 = ish5;
	}
	/**
	 * Set the lsh.
	 * 
	 * @param lsh
	 *            lsh
	 */
	public void setLsh(Integer lsh) {
		this.lsh = lsh;
	}

	/**
	 * Get the lsh.
	 * 
	 * @return lsh
	 */
	public Integer getLsh() {
		return this.lsh;
	}

	/**
	 * Set the biggametype.
	 * 
	 * @param biggametype
	 *            biggametype
	 */
	public void setBiggametype(String biggametype) {
		this.biggametype = biggametype;
	}

	/**
	 * Get the biggametype.
	 * 
	 * @return biggametype
	 */
	public String getBiggametype() {
		return this.biggametype;
	}

	/**
	 * Set the enname.
	 * 
	 * @param enname
	 *            enname
	 */
	public void setEnname(String enname) {
		this.enname = enname;
	}

	/**
	 * Get the enname.
	 * 
	 * @return enname
	 */
	public String getEnname() {
		return this.enname;
	}

	/**
	 * Set the cnname.
	 * 
	 * @param cnname
	 *            cnname
	 */
	public void setCnname(String cnname) {
		this.cnname = cnname;
	}

	/**
	 * Get the cnname.
	 * 
	 * @return cnname
	 */
	public String getCnname() {
		return this.cnname;
	}

	/**
	 * Set the trname.
	 * 
	 * @param trname
	 *            trname
	 */
	public void setTrname(String trname) {
		this.trname = trname;
	}

	/**
	 * Get the trname.
	 * 
	 * @return trname
	 */
	public String getTrname() {
		return this.trname;
	}

	/**
	 * Set the japname.
	 * 
	 * @param japname
	 *            japname
	 */
	public void setJapname(String japname) {
		this.japname = japname;
	}

	/**
	 * Get the japname.
	 * 
	 * @return japname
	 */
	public String getJapname() {
		return this.japname;
	}

	/**
	 * Set the krname.
	 * 
	 * @param krname
	 *            krname
	 */
	public void setKrname(String krname) {
		this.krname = krname;
	}

	/**
	 * Get the krname.
	 * 
	 * @return krname
	 */
	public String getKrname() {
		return this.krname;
	}

	/**
	 * Set the category.
	 * 
	 * @param category
	 *            category
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * Get the category.
	 * 
	 * @return category
	 */
	public String getCategory() {
		return this.category;
	}

	/**
	 * Set the category2.
	 * 
	 * @param category2
	 *            category2
	 */
	public void setCategory2(String category2) {
		this.category2 = category2;
	}

	/**
	 * Get the category2.
	 * 
	 * @return category2
	 */
	public String getCategory2() {
		return this.category2;
	}

	/**
	 * Set the category3.
	 * 
	 * @param category3
	 *            category3
	 */
	public void setCategory3(String category3) {
		this.category3 = category3;
	}

	/**
	 * Get the category3.
	 * 
	 * @return category3
	 */
	public String getCategory3() {
		return this.category3;
	}

	/**
	 * Set the imagename.
	 * 
	 * @param imagename
	 *            imagename
	 */
	public void setImagename(String imagename) {
		this.imagename = imagename;
	}

	/**
	 * Get the imagename.
	 * 
	 * @return imagename
	 */
	public String getImagename() {
		return this.imagename;
	}

	/**
	 * Set the gamecodeweb.
	 * 
	 * @param gamecodeweb
	 *            gamecodeweb
	 */
	public void setGamecodeweb(String gamecodeweb) {
		this.gamecodeweb = gamecodeweb;
	}

	/**
	 * Get the gamecodeweb.
	 * 
	 * @return gamecodeweb
	 */
	public String getGamecodeweb() {
		return this.gamecodeweb;
	}

	/**
	 * Set the gamecodeh5.
	 * 
	 * @param gamecodeh5
	 *            gamecodeh5
	 */
	public void setGamecodeh5(String gamecodeh5) {
		this.gamecodeh5 = gamecodeh5;
	}

	/**
	 * Get the gamecodeh5.
	 * 
	 * @return gamecodeh5
	 */
	public String getGamecodeh5() {
		return this.gamecodeh5;
	}

	/**
	 * Set the isweb.
	 * 
	 * @param isweb
	 *            isweb
	 */
	public void setIsweb(String isweb) {
		this.isweb = isweb;
	}

	/**
	 * Get the isweb.
	 * 
	 * @return isweb
	 */
	public String getIsweb() {
		return this.isweb;
	}

	/**
	 * Set the ish5.
	 * 
	 * @param ish5
	 *            ish5
	 */
	public void setIsh5(String ish5) {
		this.ish5 = ish5;
	}

	/**
	 * Get the ish5.
	 * 
	 * @return ish5
	 */
	public String getIsh5() {
		return this.ish5;
	}

	/**
	 * Set the remark.
	 * 
	 * @param remark
	 *            remark
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * Get the remark.
	 * 
	 * @return remark
	 */
	public String getRemark() {
		return this.remark;
	}

	/**
	 * Set the createtime.
	 * 
	 * @param createtime
	 *            createtime
	 */
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	/**
	 * Get the createtime.
	 * 
	 * @return createtime
	 */
	public Date getCreatetime() {
		return this.createtime;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lsh == null) ? 0 : lsh.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		ApiSoltGametype other = (ApiSoltGametype) obj;
		if (lsh == null) {
			if (other.lsh != null) {
				return false;
			}
		} else if (!lsh.equals(other.lsh)) {
			return false;
		}
		return true;
	}
	public String getStype() {
		return stype;
	}
	public void setStype(String stype) {
		this.stype = stype;
	}
	public String getOrd() {
		return ord;
	}
	public void setOrd(String ord) {
		this.ord = ord;
	}

}
