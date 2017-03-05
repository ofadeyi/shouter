(ns shouter.sample-db-utils
  (:require [clojure.java.jdbc :as sql]))

;; Create Table
;(sql/db-do-commands "postgresql://localhost:5432/shouter?user=postgres"
;                    (sql/create-table-ddl :testing [[:data :text]]))

;; Insert Data
;(sql/insert! "postgresql://localhost:5432/shouter?user=postgres"
;             :testing {:data "Hello World!"})

;; Query
;(sql/query "postgresql://localhost:5432/shouter?user=postgres"
;           ["select * from testing"])

;; Drop Table
;(sql/db-do-commands "postgresql://localhost:5432/shouter?user=postgres"
;                    "drop table testing")