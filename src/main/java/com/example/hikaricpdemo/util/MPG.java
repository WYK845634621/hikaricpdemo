//package com.example.hikaricpdemo.util;
//
//
//import com.baomidou.mybatisplus.enums.IdType;
//import com.baomidou.mybatisplus.generator.AutoGenerator;
//import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
//import com.baomidou.mybatisplus.generator.config.GlobalConfig;
//import com.baomidou.mybatisplus.generator.config.PackageConfig;
//import com.baomidou.mybatisplus.generator.config.StrategyConfig;
//import com.baomidou.mybatisplus.generator.config.rules.DbType;
//import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
//
///**
// * @Description
// * @Author yikai.wang
// * @Date 2019/1/1 12:59
// */
//public class MPG {
//    public static void main(String[] args) {
//        //1. 全局配置
//        GlobalConfig config = new GlobalConfig();
//        config.setActiveRecord(false) // 是否支持AR模式
//                .setAuthor("yikai.wang") // 作者
//                .setOutputDir("F:\\workspace_newintelij\\hikaricpdemo\\src\\main\\java") // 生成路径
//                .setFileOverride(true)  // 文件覆盖
//                .setIdType(IdType.UUID) // 主键策略
//                .setServiceName("%sService")  // 设置生成的service接口的名字的首字母是否为I
//                // IUserService
//                .setBaseResultMap(true)
//                .setBaseColumnList(true);
//
//        //2. 数据源配置
//        DataSourceConfig dsConfig = new DataSourceConfig();
//        dsConfig.setDbType(DbType.MYSQL)  // 设置数据库类型
//                .setDriverName("com.mysql.cj.jdbc.Driver")
//                .setUrl("jdbc:mysql://127.0.0.1:3306/girls?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC")
//                .setUsername("root")
//                .setPassword("root");
//
//        //3. 策略配置
//        StrategyConfig stConfig = new StrategyConfig();
//        stConfig.setCapitalMode(true) //全局大写命名
//                .setDbColumnUnderline(true)  // 指定表名 字段名是否使用下划线
//                .setNaming(NamingStrategy.underline_to_camel) // 数据库表映射到实体的命名策略
//                .setTablePrefix("tbl_")     //表前缀
//                .setInclude("beauty");  // 生成的表
//
//
//        //4. 包名策略配置
//        PackageConfig pkConfig = new PackageConfig();
//        pkConfig.setParent("com.example.hikaricpdemo")
//                .setMapper("mapper")
//                .setService("service")
//                .setController("web")
//                .setEntity("entity")
//                .setXml("mapper");
//
//        //5. 整合配置
//        AutoGenerator ag = new AutoGenerator();
//        ag.setGlobalConfig(config)
//                .setDataSource(dsConfig)
//                .setStrategy(stConfig)
//                .setPackageInfo(pkConfig);
//
//        //6. 执行
//        ag.execute();
//
//    }
//}
