dataSource {
     pooled = true
    driverClassName = "org.postgresql.Driver"
    dialect = org.hibernate.dialect.PostgreSQLDialect

    username = "postgres"
    password = "admin"
 
	configClass = com.pointbridge.mis.config.DdlFilterConfiguration
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
   // cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory' // Hibernate 3
    cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory' // Hibernate 4
}

// environment specific settings
environments {
    development {
	  dataSource {
	    // one of 'create', 'create-drop','update'
	    dbCreate = "update" 
	    url="jdbc:postgresql://localhost:5433/erp"
		logSql = true
		username = "postgres"
		password="admin"
	  }
	 }
	 test {
	  dataSource {
	    dbCreate = "update"
	    url="jdbc:postgresql://localhost:5433/erp"
	   
	   
	  }
	 }
	 production {
	  dataSource {
		  logSql = true
	    dbCreate = "update"
	    url="jdbc:postgresql://localhost:5433/erp"
	    pooled = true

	  }
	 }
}
