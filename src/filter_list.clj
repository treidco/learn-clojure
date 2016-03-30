(ns filter-list)

(fn [delim lst]
    (letfn [(ltD [x]
                 (if (< x delim) (list x) (list)))
            (f [ls acc]
               (if (empty? (rest ls))
                 (concat acc (ltD (first ls)))
                 (concat acc (f (rest ls) (ltD (first ls))))))]
           (f lst (list))))