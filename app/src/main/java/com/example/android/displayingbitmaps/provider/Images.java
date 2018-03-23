/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.displayingbitmaps.provider;

/**
 * Some simple test data to use for this sample app.
 */
public class Images {

    /**
     * This are PicasaWeb URLs and could potentially change. Ideally the PicasaWeb API should be
     * used to fetch the URLs.
     * <p>
     * Credit to Romain Guy for the photos:
     * http://www.curious-creature.org/
     * https://plus.google.com/109538161516040592207/about
     * http://www.flickr.com/photos/romainguy
     */
    public final static String[] imageUrls = new String[]{
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1521804530295&di=2e545878145504cb5727eb9b5dfb71fc&imgtype=0&src=http%3A%2F%2Fwww.sucaitianxia.com%2Fd%2Ffile%2F20120418%2F770c55a2715901383b6ac8ada32accf8.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1521804568056&di=55f137f2631d90c6007358a959352b02&imgtype=0&src=http%3A%2F%2Fd.hiphotos.baidu.com%2Fzhidao%2Fpic%2Fitem%2F5fdf8db1cb134954fa3d7096564e9258d1094a25.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1522399298&di=f6781efe2a54df97b3e96f02def080f3&imgtype=jpg&er=1&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F2%2F57e0fc465d511.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1521804585869&di=a9a70df09abc96f5834f5f18d0486e59&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fpic%2Fc%2F37%2F47c71230719.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1521804593188&di=cd2ea0287fbce3e6d9cb48ae49e7f4c5&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2Fb%2F57faf439bbdbb.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1521804600349&di=432cc4242177ecdfdcc651ad4841519f&imgtype=0&src=http%3A%2F%2Fdaj.wuning.gov.cn%2FUploadFiles%2F2013%2F2%2F2013012120082043984.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1521804608026&di=d36fe1fc0bc615c7f2fef8ec0a30adde&imgtype=0&src=http%3A%2F%2Fimg.tupianzj.com%2Fuploads%2Fallimg%2F151224%2F9-151224214003.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1521804617873&di=0eafa2ba981e8a6eac4a7924c9847259&imgtype=0&src=http%3A%2F%2Fimg17.3lian.com%2Fd%2Ffile%2F201701%2F17%2F2beef1ed5888e7534051db62c6acc86c.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1521804627991&di=f0713eae6c112d9d8596bc11ed7246a2&imgtype=0&src=http%3A%2F%2Fimg.tupianzj.com%2Fuploads%2Fallimg%2F151224%2F9-151224213957.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1521804635744&di=9db116d9e728237d744cbcd8085d6bdb&imgtype=0&src=http%3A%2F%2Fp4.gexing.com%2FG1%2FM00%2FE5%2F55%2FrBACJ1a9YtvRUc16AA4x2Pu8BzY179.jpg",
            "https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=905073590,1992174144&fm=27&gp=0.jpg",
            "https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=1250388265,1473990254&fm=27&gp=0.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1521804660192&di=7337a8907bd153604cce12b361622fd0&imgtype=0&src=http%3A%2F%2Fup.enterdesk.com%2Fedpic_source%2Fbd%2F63%2Fd0%2Fbd63d01195c7a793683f9d564bb2b3fe.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1521804666250&di=a48f83968fb293a9fb5160715ab83d7f&imgtype=0&src=http%3A%2F%2Fimg.tupianzj.com%2Fuploads%2Fallimg%2F151224%2F9-151224213944.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1521804676617&di=27786377769223bea9bc9874e7860ee5&imgtype=0&src=http%3A%2F%2Fimg.tupianzj.com%2Fuploads%2Fallimg%2F151224%2F9-151224214019.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1521804689496&di=8e847e48292cc57a2d07d807985224b6&imgtype=0&src=http%3A%2F%2Fyouimg1.c-ctrip.com%2Ftarget%2Ffd%2Ftg%2Fg2%2FM02%2F87%2FEB%2FCghzgVWwtfaACLuMAB5ZiwfP4eE841.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1521804695833&di=c41a28010b27a07a832872c16af8da81&imgtype=0&src=http%3A%2F%2Fimg5.duitang.com%2Fuploads%2Fitem%2F201409%2F17%2F20140917015743_YXGwr.png",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1521804703257&di=93bdd4e6fecd9169621c24b89b78f869&imgtype=0&src=http%3A%2F%2Fimg.tupianzj.com%2Fuploads%2Fallimg%2F151224%2F9-151224213951.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1521804710164&di=c726fbab245cecd2e07075b49711fcbf&imgtype=0&src=http%3A%2F%2Fimg17.3lian.com%2Fd%2Ffile%2F201702%2F22%2F2c3820322a7477860c66afc97021ab11.jpg",
    };

    /**
     * This are PicasaWeb thumbnail URLs and could potentially change. Ideally the PicasaWeb API
     * should be used to fetch the URLs.
     * <p>
     * Credit to Romain Guy for the photos:
     * http://www.curious-creature.org/
     * https://plus.google.com/109538161516040592207/about
     * http://www.flickr.com/photos/romainguy
     */
    public final static String[] imageThumbUrls = new String[]{
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1521804530295&di=2e545878145504cb5727eb9b5dfb71fc&imgtype=0&src=http%3A%2F%2Fwww.sucaitianxia.com%2Fd%2Ffile%2F20120418%2F770c55a2715901383b6ac8ada32accf8.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1521804568056&di=55f137f2631d90c6007358a959352b02&imgtype=0&src=http%3A%2F%2Fd.hiphotos.baidu.com%2Fzhidao%2Fpic%2Fitem%2F5fdf8db1cb134954fa3d7096564e9258d1094a25.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1522399298&di=f6781efe2a54df97b3e96f02def080f3&imgtype=jpg&er=1&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F2%2F57e0fc465d511.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1521804585869&di=a9a70df09abc96f5834f5f18d0486e59&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fpic%2Fc%2F37%2F47c71230719.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1521804593188&di=cd2ea0287fbce3e6d9cb48ae49e7f4c5&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2Fb%2F57faf439bbdbb.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1521804600349&di=432cc4242177ecdfdcc651ad4841519f&imgtype=0&src=http%3A%2F%2Fdaj.wuning.gov.cn%2FUploadFiles%2F2013%2F2%2F2013012120082043984.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1521804608026&di=d36fe1fc0bc615c7f2fef8ec0a30adde&imgtype=0&src=http%3A%2F%2Fimg.tupianzj.com%2Fuploads%2Fallimg%2F151224%2F9-151224214003.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1521804617873&di=0eafa2ba981e8a6eac4a7924c9847259&imgtype=0&src=http%3A%2F%2Fimg17.3lian.com%2Fd%2Ffile%2F201701%2F17%2F2beef1ed5888e7534051db62c6acc86c.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1521804627991&di=f0713eae6c112d9d8596bc11ed7246a2&imgtype=0&src=http%3A%2F%2Fimg.tupianzj.com%2Fuploads%2Fallimg%2F151224%2F9-151224213957.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1521804635744&di=9db116d9e728237d744cbcd8085d6bdb&imgtype=0&src=http%3A%2F%2Fp4.gexing.com%2FG1%2FM00%2FE5%2F55%2FrBACJ1a9YtvRUc16AA4x2Pu8BzY179.jpg",
            "https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=905073590,1992174144&fm=27&gp=0.jpg",
            "https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=1250388265,1473990254&fm=27&gp=0.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1521804660192&di=7337a8907bd153604cce12b361622fd0&imgtype=0&src=http%3A%2F%2Fup.enterdesk.com%2Fedpic_source%2Fbd%2F63%2Fd0%2Fbd63d01195c7a793683f9d564bb2b3fe.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1521804666250&di=a48f83968fb293a9fb5160715ab83d7f&imgtype=0&src=http%3A%2F%2Fimg.tupianzj.com%2Fuploads%2Fallimg%2F151224%2F9-151224213944.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1521804676617&di=27786377769223bea9bc9874e7860ee5&imgtype=0&src=http%3A%2F%2Fimg.tupianzj.com%2Fuploads%2Fallimg%2F151224%2F9-151224214019.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1521804689496&di=8e847e48292cc57a2d07d807985224b6&imgtype=0&src=http%3A%2F%2Fyouimg1.c-ctrip.com%2Ftarget%2Ffd%2Ftg%2Fg2%2FM02%2F87%2FEB%2FCghzgVWwtfaACLuMAB5ZiwfP4eE841.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1521804695833&di=c41a28010b27a07a832872c16af8da81&imgtype=0&src=http%3A%2F%2Fimg5.duitang.com%2Fuploads%2Fitem%2F201409%2F17%2F20140917015743_YXGwr.png",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1521804703257&di=93bdd4e6fecd9169621c24b89b78f869&imgtype=0&src=http%3A%2F%2Fimg.tupianzj.com%2Fuploads%2Fallimg%2F151224%2F9-151224213951.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1521804710164&di=c726fbab245cecd2e07075b49711fcbf&imgtype=0&src=http%3A%2F%2Fimg17.3lian.com%2Fd%2Ffile%2F201702%2F22%2F2c3820322a7477860c66afc97021ab11.jpg",
    };
}
