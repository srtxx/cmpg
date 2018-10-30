n,w,mw = gets().split(" ").map(&:to_i)
a = [w]
ca = []
(n).times do
  ca = []
  wl,wg = gets().split(" ").map(&:to_i)
  for j in 0..a.count - 1 do
    ca.push(a[j] - wl)
    if (a[j] + wg <= mw)
      ca.push(a[j] + wg)
    end
  end
  a = ca
end
puts(a.count)
