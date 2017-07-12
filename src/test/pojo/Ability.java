package test.pojo;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 开放能力表
 * </p>
 *
 * @author Yanghu
 * @since 2017-03-10
 */
@TableName("api_ability")
public class Ability extends Model<Ability> {

    private static final long serialVersionUID = 1L;

    /**
     * 能力ID
     */
    @TableId("ABILITY_ID")
	private String abilityId;
    /**
     * 能力名称
     */
	@TableField("ABILITY_NAME")
	private String abilityName;
    /**
     * 能力描述
     */
	@TableField("REMARK")
	private String remark;
    /**
     * 能力标识
     */
	@TableField("ABILITY_TAG")
	private String abilityTag;
    /**
     * 是否为公用能力
     */
	@TableField("IS_COMMON")
	private String isCommon;
    /**
     * 并发数
     */
	@TableField("CONCURRENT_NUM")
	private Integer concurrentNum;


	public String getAbilityId() {
		return abilityId;
	}

	public void setAbilityId(String abilityId) {
		this.abilityId = abilityId;
	}

	public String getAbilityName() {
		return abilityName;
	}

	public void setAbilityName(String abilityName) {
		this.abilityName = abilityName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getAbilityTag() {
		return abilityTag;
	}

	public void setAbilityTag(String abilityTag) {
		this.abilityTag = abilityTag;
	}

	public String getIsCommon() {
		return isCommon;
	}

	public void setIsCommon(String isCommon) {
		this.isCommon = isCommon;
	}

	public Integer getConcurrentNum() {
		return concurrentNum;
	}

	public void setConcurrentNum(Integer concurrentNum) {
		this.concurrentNum = concurrentNum;
	}

	@Override
	protected Serializable pkVal() {
		return this.abilityId;
	}

}
