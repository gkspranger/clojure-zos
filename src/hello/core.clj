(ns hello.core
  (:gen-class))

(defn load-ds [dsn]
  (let [ds (com.ibm.jzos.ZFile. dsn "rb,type=record,noseek")]
    (println (str "  file name: " (.getActualFilename ds)))
    (println (str "      dsorg: " (.getDsorg ds)))
    (println (str "rec. format: " (.getRecfm ds)))
    (println (str "rec. length: " (.getLrecl ds)))
    ds))

(defn get-ds [file]
  (let [dsn (str "//'" file "'")
        dsn-exists (. com.ibm.jzos.ZFile dsExists dsn)]
    (when dsn-exists
      (load-ds dsn))))

(defn print-ds [ds]
  (when ds
    (let [rec (byte-array (.getLrecl ds))]
      (while (not= -1 (.read ds rec))
        (println (String. rec))))))

(defn -main
  [& args]
  (when-let [file (first args)]
    (if-let [ds (get-ds file)]
      (print-ds ds)
      (println (str file "was not found")))))
