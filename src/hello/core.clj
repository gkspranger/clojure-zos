(ns hello.core
  (:gen-class)
  (:import com.ibm.jzos.ZFile))

(defn doit []
  (let [ds (new com.ibm.jzos.ZFile
                "//'MYZUSER.TEST.PS'"
                "rb,type=record,noseek")
        file-name (.getActualFilename ds)
        rec-fmt (.getRecfm ds)
        rec-len (.getLrecl ds)
        byt (byte-array rec-len)]
    (println file-name)
    (println rec-fmt)
    (println rec-len)

    (while (not= -1 (.read ds byt))
      (println (String. byt)))))

(defn -main
  [& _args]
  (doit))

(comment
  
  (-main)
  
  )