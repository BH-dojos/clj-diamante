(ns diamante.core)

(defn imprime-intervalo [letra-final]
	(if (= letra-final \A)
		[]
		(map char (range 65 (inc (int letra-final)))))
	)

(defn criar-linha [letra])

(defn imprime-diamante [letra]
	(map criar-linha (imprime-intervalo letra)))
