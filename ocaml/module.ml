module Sample =
  struct
    let inc x = x + 1
    module Inner =
      struct 
        let z = inc 100
      end
  end
;;
  
(* open Sample;; *)

(* inc Inner.z;; *)

module Sample2 = 
  struct
    open Sample.Inner
    let a = z + 1
  end
;;

Sample2.a;;
(* z;; *)

let open Sample.Inner in z + 100;;