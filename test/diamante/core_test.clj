(ns diamante.core-test
  (:require [midje.sweet :refer :all]
            [diamante.core :refer :all]))


(comment

(fact "Imprime diamante A-B"
	(imprime-diamante \B ) => " A \nB B\n A ")

(fact "Imprime diamante A-C"
	(imprime-diamante \C ) => "  A  \n B B \nC   C\n B B \n  A  ")


(fact "")

)

(fact "criar - linha"
	(criar)
	)