## Java Split的用法
将一个字符串分割为子字符串,然后将结果作为字符串数组返回。

做题的时候遇到的一些细节问题：

**1.如果s= " " 的时候，返回的array的长度是0；**

```
class TestSplit {
	public static void main(String[] args) {
		String s = "  ";
		String[] str = s.split(" ");
		System.out.println(str.length);
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
	}
}

```
运行结果：
`0
`
**1.如果s= " 1" 的时候，返回的array的长度是2；**

```
class TestSplit {
	public static void main(String[] args) {
		String s = " 1";
		String[] str = s.split(" ");
		System.out.println(str.length);
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
	}
}
```
运行结果：

```
2

1
```
**1.如果s= " 1 " 的时候，返回的array的长度是2；**

```
class TestSplit {
	public static void main(String[] args) {
		String s = " 1";
		String[] str = s.split(" ");
		System.out.println(str.length);
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
	}
}
```
运行结果：

```
2

1
```
**1.如果s= "1 " 的时候，返回的array的长度是1；**

```
class TestSplit {
	public static void main(String[] args) {
		String s = " 1";
		String[] str = s.split(" ");
		System.out.println(str.length);
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
	}
}
```
运行结果：

```
1
1
```
**1.如果s= "1  1" 的时候，返回的array的长度是3；**

```
class TestSplit {
	public static void main(String[] args) {
		String s = " 1";
		String[] str = s.split(" ");
		System.out.println(str.length);
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
	}
}
```
运行结果：

```
3
1

1
```
####总结：
split在分割的时候，如果前面一直都是" " 就不能分，如果在中间连续两个“ ” 只能分一个。
