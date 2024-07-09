(ns hello.core
  (:gen-class))

(defn doit []
  (let [ds (com.ibm.jzos.ZFile.
            "//'MYZUSER.TEST.PS'"
            "rb,type=record,noseek")
        recl (.getLrecl ds)
        ba (byte-array recl)]
    (println (str "  file name: " (.getActualFilename ds)))
    (println (str "rec. format: " (.getRecfm ds)))
    (println (str "rec. length: " recl))

    (while (not= -1 (.read ds ba))
      (println (String. ba)))))

(defn -main
  [& _args]
  (doit))

(comment
  
  (-main)
  
  )
