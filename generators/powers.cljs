#!/usr/local/bin/planck

(def intents
  ["Create"
   "Create"
   "Create"
   "Destroy"
   "Destroy"
   "Consecrate"
   "Consecrate"
   "Corrupt"
   "Corrupt"
   "Move"])

(def objects
  ["Water"
   "Earth"
   "Civilization"
   "Creatures"
   "Plants"])

(def csv-lines
  (flatten
   (for [intent intents]
     (for [object objects]
       (str intent "," object)))))

(println "intent,object")
(doseq [csv csv-lines]
  (println csv))