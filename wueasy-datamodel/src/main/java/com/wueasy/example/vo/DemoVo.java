/*
 * Copyright (C) 2017-2020 wueasy.com , All Rights Reserved.

 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at

 *     http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */	
package com.wueasy.example.vo;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class DemoVo implements Serializable{
	private static final long serialVersionUID = -96884876803197634L;

	@ApiModelProperty(value = "id")
    private Long id;

	@ApiModelProperty(value = "名称")
    private String name;

	@ApiModelProperty(value = "uuid")
    private String uuid;

	@ApiModelProperty(value = "创建时间")
    private Date createdTime;

}
