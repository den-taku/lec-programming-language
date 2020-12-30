module Sample =
  struct
    let inc x = x + 1
    module Inner =
      struct 
        let z = inc 100
      end
  end
;;
  