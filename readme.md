
## pagehelper分页插件配置
```yaml
#标识是哪一种数据库
pagehelper.helperDialect=mysql
#启用合理化，如果pageNum<1会查询第一页，如果pageNum>pages会查询最后一页
pagehelper.reasonable=true
#为了支持startPage(Object params)方法，增加了该参数来配置参数映射，用于从对象中根据属性名取值， 可以配置pageNum,pageSize,count,pageSizeZero,reasonable，不配置映射的用默认值， 默认值为pageNum=pageNum;pageSize=pageSize;count=countSql;reasonable=reasonable;pageSizeZero=pageSizeZero
pagehelper.params=count=countSql
#支持通过 Mapper 接口参数来传递分页参数，默认值false，分页插件会从查询方法的参数值中，自动根据上面 params 配置的字段中取值，查找到合适的值时就会自动分页
pagehelper.supportMethodsArguments=true
#如果 pageSize=0 就会查询出全部的结果（相当于没有执行分页查询）
pagehelper.page-size-zero=true
```