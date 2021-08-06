![](https://github.com/wniemiec-util-data/string-utils/blob/master/docs/img/logo/logo.jpg)

<h1 align='center'>StringUtils</h1>
<p align='center'>Contains methods that perform string manipulation.</p>
<p align="center">
	<a href="https://github.com/wniemiec-util-data/string-utils/actions/workflows/windows.yml"><img src="https://github.com/wniemiec-util-data/string-utils/actions/workflows/windows.yml/badge.svg" alt=""></a>
	<a href="https://github.com/wniemiec-util-data/string-utils/actions/workflows/macos.yml"><img src="https://github.com/wniemiec-util-data/string-utils/actions/workflows/macos.yml/badge.svg" alt=""></a>
	<a href="https://github.com/wniemiec-util-data/string-utils/actions/workflows/ubuntu.yml"><img src="https://github.com/wniemiec-util-data/string-utils/actions/workflows/ubuntu.yml/badge.svg" alt=""></a>
	<a href="https://codecov.io/gh/wniemiec-util-data/string-utils"><img src="https://codecov.io/gh/wniemiec-util-data/string-utils/branch/master/graph/badge.svg?token=R2SFS4SP86" alt="Coverage status"></a>
	<a href="http://java.oracle.com"><img src="https://img.shields.io/badge/java-11+-D0008F.svg" alt="Java compatibility"></a>
	<a href="https://github.com/wniemiec-util-data/string-utils/releases"><img src="https://img.shields.io/github/v/release/wniemiec-util-data/string-utils" alt="Release"></a>
	<a href="https://github.com/wniemiec-util-data/string-utils/blob/master/LICENSE"><img src="https://img.shields.io/github/license/wniemiec-util-data/string-utils" alt="License"></a>
</p>
<hr />

## ❇ Introduction
Methods package that perform string manipulation.

## ❓ How to use
1. Add this to pom.xml:
```
<dependency>
  <groupId>wniemiec.util.data</groupId>
  <artifactId>string-utils</artifactId>
  <version>1.0.0</version>
</dependency>
```

2. Run
```
$ mvn install
```

3. Use it
```
[...]

import wniemiec.util.data.StringUtils;

[...]

List<String> words = List.of("Hello", "World");

System.out.println( StringUtils.implode(words, " ") );
```

## 📖 Documentation
|        Property        |Type|Description|Default|
|----------------|-------------------------------|-----------------------------|--------|
|implode |`list: List<T>, delimiter: String: String`|Converts elements of a list into a string by separating each element with a delimiter| - |


## 🚩 Changelog
Details about each version are documented in the [releases section](https://github.com/williamniemiec/wniemiec-util-data/string-utils/releases).

## 🤝 Contribute!
See the documentation on how you can contribute to the project [here](https://github.com/wniemiec-util-data/string-utils/blob/master/CONTRIBUTING.md).

## 📁 Files

### /
|        Name        |Type|Description|
|----------------|-------------------------------|-----------------------------|
|dist |`Directory`|Released versions|
|docs |`Directory`|Documentation files|
|src     |`Directory`| Source files|
