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
package android.marshon.likequanmintv.di.component;

import android.app.Activity;
import android.content.Context;
import android.marshon.likequanmintv.di.module.FragmentModule;
import android.marshon.likequanmintv.di.scope.ContextLife;
import android.marshon.likequanmintv.di.scope.PerFragment;
import android.marshon.likequanmintv.mvp.main.LiveFragment;
import android.marshon.likequanmintv.mvp.main.RecommendFragment;
import android.marshon.likequanmintv.mvp.recommend.ui.RecommendRecommendFragment;

import dagger.Component;

/**
 * @author Marshon
 * @version 1.0 2016/6/23
 */
@PerFragment
@Component(dependencies = ApplicationComponent.class, modules = FragmentModule.class)
public interface FragmentComponent {
    @ContextLife("Activity")
    Context getActivityContext();

    @ContextLife("Application")
    Context getApplicationContext();

    Activity getActivity();


    void inject(RecommendFragment liveFragment);
    void inject(RecommendRecommendFragment recommendRecommendFragment);
    void inject(LiveFragment liveFragment);
}
