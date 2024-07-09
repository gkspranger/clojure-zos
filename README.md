# Using Clojure on z/OS

## Simple reading of a dataset and printing out

- PS datset is located at `MYZUSER.TEST.PS`

- RECFM = FB, LRECL = 80

- compiled uberjar and SCP'ed to USS

- ran java jar via USS

```shell
/z/myzuser > java -jar hello-0.1.0-SNAPSHOT-standalone.jar
MYZUSER.TEST.PS
FB
80
daddy,jim,49                                                            00000100
mommy,jim,47                                                            00000200
baby,jim,12                                                             00000300
middle,jim,17                                                           00000400
oldest,jim,14                                                           00000500
```
