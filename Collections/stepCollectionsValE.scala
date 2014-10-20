val e = List(Some(1), Some(0), None, Some(2), Some(-1)).map(o => o.filter(_>0)).filterNot(_==None)
