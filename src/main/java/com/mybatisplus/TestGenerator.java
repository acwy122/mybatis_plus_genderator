package com.mybatisplus;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class TestGenerator {



    public static void main(String[] args) {
        AutoGenerator autoGenerator = new AutoGenerator();
        //全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        //设置作者
        globalConfig.setAuthor("biao");
        //设置完成输出路径
        globalConfig.setOutputDir("D:\\check");
        //设置路径覆盖
        globalConfig.setFileOverride(true);
        //设置主键生成策略
        globalConfig.setIdType(IdType.AUTO);
        //service接口名称
        globalConfig.setServiceName("%sService");
        //基本结果集合
        globalConfig.setBaseResultMap(true);
        //设置基本的列
        globalConfig.setBaseColumnList(true);
        //
        //globalConfig.setActiveRecord();
        //设置controller名称
        globalConfig.setControllerName("%sController");


        //#####
        //配置数据源

        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver")
                .setUrl("jdbc:mysql://localhost:3306/user_code?serverTimezone=UTC")
                .setUsername("root")
                .setPassword("123456");


        //####
        //配置策略
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setInclude();//设置要包含的表
        strategyConfig.setTablePrefix("");//设置表的前缀
        strategyConfig.setNaming(NamingStrategy.no_change);//映射实体类的时候命名策略

        //####
        //包名配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.mybatisplus");
        packageConfig.setMapper("mapper");
        packageConfig.setService("service");
        packageConfig.setServiceImpl("service.impl");
        packageConfig.setController("controller");
        packageConfig.setEntity("bean");
        packageConfig.setXml("mapper.xml");

        //设置到autoGenerator中
        autoGenerator.setGlobalConfig(globalConfig)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(packageConfig);
        //开始请求
        autoGenerator.execute();



    }
}
