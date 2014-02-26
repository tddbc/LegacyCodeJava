レガシーコード改善デモ用コード
====================================

これは、レガシーコード改善体験会のデモ用に作成されたプロジェクトです。

## 本プロジェクトについて

[java_junit](https://github.com/tddbc/java_junit)プロジェクトの設定ファイルを一部利用しています。変更点は、以下の通りです。

* gradle wrapperのバージョンを最新に変更（2014/02/26時点）
* src 下のファイルをレガシーコードに差し替え
* pom.xmlの削除
* Maven に関する記述の削除

本プロジェクトにはレガシコードが含まれています。製品コードへの利用は控えることをお勧めします。

## gradleを使う場合

### gradleのインストール(wrapperを使わない場合)

```bash
# Mac
$ brew install gradle
または、
$ gvm install gradle

# Unix
$ gvm install gradle
```
gvmについては、以下のURLを参考にしてインストールしてください

http://gvmtool.net/

#### Windows
以下のURLを参考にしてインストールしてください。

http://gradle.monochromeroad.com/docs/userguide/installation.html

### gradle wrapperの準備

gradleをインストールしない場合は、このプロジェクトをcloneしてから以下のコマンドを実行してください。

```bash
# Mac, Unix
$ chmod +x gradlew
$ ./gradlew -v

# Windows
$ gradlew.bat -v
```

wrapperを利用する際は、以下のgradleコマンドを **./gradlew** または **gradlew.bat** に置き換えて利用してください。

### プロジェクトの変換

```bash
# for. IntelliJ IDEA
$ gradle idea

# for. Eclipse
$ gradle eclipse
```

### テストの実行

```bash
$ gradle test
```

### gradleによるJava Projectの作成(gradle 1.9以降)

gradleがインストールされている環境では、以下のコマンドを実行することで、Javaのプロジェクトを作成することが出来ます。

```bash
$ mkdir tddbc-java
$ cd tddbc-java
$ gradle init --type java-library
```

## その他

動作環境、IDE等については[Wiki](https://github.com/tddbc/java_junit/wiki)を参照してください。

## ライセンス
Apache License, Version 2.0です (詳しくはプロジェクト直下の LICENSE-2.0.txt をご覧ください)

