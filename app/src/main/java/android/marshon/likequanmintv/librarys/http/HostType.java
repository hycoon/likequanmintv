/*
 * Copyright (c) 2016 咖枯 <kaku201313@163.com | 3772304@qq.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package android.marshon.likequanmintv.librarys.http;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author 咖枯
 * @version 1.0 2016/5/25
 */
public class HostType {


    /**
     * 笑话
     */
    public static final int NETEASE_JOKE = 1;

    /**
     * 其他
     */
    public static final int NETEASE_OTHER = 2;


    /**
     * 替代枚举的方案，使用IntDef保证类型安全
     */
    @IntDef({NETEASE_JOKE,NETEASE_OTHER})
    @Retention(RetentionPolicy.SOURCE)
    public @interface HostTypeChecker {

    }

}
