/**
 * 
 */
package org.sagacity.sqltoy.model;

import java.io.Serializable;

/**
 * @project sagacity-sqltoy
 * @description 并行配置
 * @author zhongxuchen
 * @version v1.0, Date:2020-12-14
 * @modify 2020-12-14,修改说明
 */
public class ParallelConfig implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5130763135305535186L;

	/**
	 * 最大等待时长(秒)
	 */
	private Integer maxWaitSeconds;

	/**
	 * 最大并行数量
	 */
	private Integer maxThreads = 10;

	public static ParallelConfig create() {
		return new ParallelConfig();
	}

	/**
	 * @return the maxWaitSeconds
	 */
	public Integer getMaxWaitSeconds() {
		return maxWaitSeconds;
	}

	/**
	 * @param maxWaitSeconds the maxWaitSeconds to set
	 */
	public ParallelConfig maxWaitSeconds(Integer maxWaitSeconds) {
		if (maxWaitSeconds != null && maxWaitSeconds > 0) {
			this.maxWaitSeconds = maxWaitSeconds;
		}
		return this;
	}

	/**
	 * @return the maxThreads
	 */
	public Integer getMaxThreads() {
		return maxThreads;
	}

	/**
	 * @param maxThreads the maxThreads to set
	 */
	public ParallelConfig maxThreads(Integer maxThreads) {
		if (maxThreads != null && maxThreads > 0) {
			this.maxThreads = maxThreads;
		}
		return this;
	}

}
