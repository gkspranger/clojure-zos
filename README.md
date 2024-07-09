# Using Clojure on z/OS

- I think there is a huge opportunity to incorporate Clojure and the z/OS platform

- z/OS is for data intensive applications, Clojure does data very well


## Simple reading of a dataset and printing out

- wanted to see how hard it would be to read a simple PS dataset

- knowledge could be carried over to read from PDS members as well

- PS datset is located at `MYZUSER.TEST.PS`

- RECFM = FB, LRECL = 80

- compiled uberjar and SCP'ed to USS

- ran java jar via USS

- typical java cold start blah

```shell
/z/myzuser > java -jar hello-0.1.0-SNAPSHOT-standalone.jar
  file name: MYZUSER.TEST.PS
rec. format: FB
rec. length: 80
daddy,jim,49                                                            00000100
mommy,jim,47                                                            00000200
baby,jim,12                                                             00000300
middle,jim,17                                                           00000400
oldest,jim,14                                                           00000500
```
