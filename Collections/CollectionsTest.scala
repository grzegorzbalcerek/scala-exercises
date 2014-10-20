object CollectionsTest extends App {
  import Collections._
  assert(Collections.a == 21, "Collections.a == 21")
  assert(Collections.b == List(4, 3, 2, 1), "Collections.b == List(4, 3, 2, 1)")
  assert(Collections.c == Map(1 -> 's', 2 -> 'c', 4 -> 'l'), "Collections.c == Map(1 -> s, 2 -> c, 4 -> l)")
  assert(Collections.d == "   1    2    3    4    5    6    7    8    9   10\n   2    4    6    8   10   12   14   16   18   20\n   3    6    9   12   15   18   21   24   27   30\n   4    8   12   16   20   24   28   32   36   40\n   5   10   15   20   25   30   35   40   45   50\n   6   12   18   24   30   36   42   48   54   60\n   7   14   21   28   35   42   49   56   63   70\n   8   16   24   32   40   48   56   64   72   80\n   9   18   27   36   45   54   63   72   81   90\n  10   20   30   40   50   60   70   80   90  100", "test d")
  assert(Collections.e == List(Some(1), Some(2)), "Collections.e == List(Some(1), Some(2))")
  assert(Collections.f == List(Right(1), Left(3), Right(2)), "Collections.f == List(Right(1), Left(3), Right(2))")
  assert(Collections.g == 55, "Collections.g == 55")
  assert(Collections.h == 3628800, "Collections.h == 3628800")
  assert(Collections.i == List(1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800), "Collections.i == List(1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800)")
  assert(Collections.j == 55, "Collections.j == 55")
  assert(Collections.k == (-7,10), "Collections.k == (-7,10)")
  assert(Collections.l == Map("to" -> 2, "be" -> 2, "or" -> 1, "not" -> 1), "Collections.l == Map(to -> 2, be -> 2, or -> 1, not -> 1)")
}
