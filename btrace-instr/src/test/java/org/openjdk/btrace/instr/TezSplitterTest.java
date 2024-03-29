package org.openjdk.btrace.instr;

import org.junit.jupiter.api.Test;

public class TezSplitterTest extends InstrumentorTestBase {
  @Test
  public void test1() throws Exception {
    originalBC = loadTargetClass("classdata/TezSplitter");
    transform("issues/TezSplitter");
    checkTransformation(
    "ICONST_4\n" +
            "ANEWARRAY java/lang/Object\n" +
            "DUP\n" +
            "ICONST_0\n" +
            "ALOAD 1\n" +
            "AASTORE\n" +
            "DUP\n" +
            "ICONST_1\n" +
            "ALOAD 2\n" +
            "AASTORE\n" +
            "DUP\n" +
            "ICONST_2\n" +
            "ILOAD 3\n" +
            "INVOKESTATIC java/lang/Integer.valueOf (I)Ljava/lang/Integer;\n" +
            "AASTORE\n" +
            "DUP\n" +
            "ICONST_3\n" +
            "ALOAD 4\n" +
            "AASTORE\n" +
            "INVOKESTATIC org/apache/hadoop/mapred/split/TezMapredSplitsGrouper.$btrace$org$openjdk$btrace$runtime$auxiliary$TezSplitter$getGroupedSplitsHook ([Ljava/lang/Object;)V\n" +
            "ICONST_5\n" +
            "ANEWARRAY java/lang/Object\n" +
            "DUP\n" +
            "ICONST_0\n" +
            "ALOAD 1\n" +
            "AASTORE\n" +
            "DUP\n" +
            "ICONST_1\n" +
            "ALOAD 2\n" +
            "AASTORE\n" +
            "DUP\n" +
            "ICONST_2\n" +
            "ILOAD 3\n" +
            "INVOKESTATIC java/lang/Integer.valueOf (I)Ljava/lang/Integer;\n" +
            "AASTORE\n" +
            "DUP\n" +
            "ICONST_3\n" +
            "ALOAD 4\n" +
            "AASTORE\n" +
            "DUP\n" +
            "ICONST_4\n" +
            "ALOAD 5\n" +
            "AASTORE\n" +
            "INVOKESTATIC org/apache/hadoop/mapred/split/TezMapredSplitsGrouper.$btrace$org$openjdk$btrace$runtime$auxiliary$TezSplitter$getGroupedSplitsHook ([Ljava/lang/Object;)V\n" +
            "LSTORE 23\n" +
            "LSTORE 25\n" +
            "LSTORE 27\n" +
            "LLOAD 25\n" +
            "LLOAD 27\n" +
            "LLOAD 27\n" +
            "FRAME FULL [org/apache/hadoop/mapred/split/TezMapredSplitsGrouper org/apache/hadoop/conf/Configuration [Lorg/apache/hadoop/mapred/InputSplit; I java/lang/String org/apache/hadoop/mapred/split/SplitSizeEstimator I java/lang/String java/lang/String [Ljava/lang/String; I J java/util/Map I T T T T T T T T J J J] []\n" +
            "LLOAD 25\n" +
            "LLOAD 27\n" +
            "LLOAD 23\n" +
            "LLOAD 25\n" +
            "LLOAD 25\n" +
            "LLOAD 23\n" +
            "LLOAD 25\n" +
            "LLOAD 23\n" +
            "LLOAD 27\n" +
            "LLOAD 27\n" +
            "FRAME FULL [org/apache/hadoop/mapred/split/TezMapredSplitsGrouper org/apache/hadoop/conf/Configuration [Lorg/apache/hadoop/mapred/InputSplit; I java/lang/String org/apache/hadoop/mapred/split/SplitSizeEstimator I java/lang/String java/lang/String [Ljava/lang/String; I J java/util/Map I T T T T T T I T J J J] []\n" +
            "LLOAD 23\n" +
            "LLOAD 27\n" +
            "ISTORE 23\n" +
            "ASTORE 29\n" +
            "ALOAD 29\n" +
            "ISTORE 25\n" +
            "ISTORE 30\n" +
            "FRAME FULL [org/apache/hadoop/mapred/split/TezMapredSplitsGrouper org/apache/hadoop/conf/Configuration [Lorg/apache/hadoop/mapred/InputSplit; I java/lang/String org/apache/hadoop/mapred/split/SplitSizeEstimator I java/lang/String java/lang/String [Ljava/lang/String; I J java/util/Map [Lorg/apache/hadoop/mapred/InputSplit; T T T T T T T T I T I T T T [Lorg/apache/hadoop/mapred/InputSplit; I] []\n" +
            "ILOAD 30\n" +
            "ILOAD 25\n" +
            "ALOAD 29\n" +
            "ILOAD 30\n" +
            "ASTORE 27\n" +
            "ALOAD 27\n" +
            "ASTORE 31\n" +
            "ALOAD 31\n" +
            "ALOAD 27\n" +
            "ILOAD 23\n" +
            "IINC 23 1\n" +
            "ALOAD 31\n" +
            "IINC 30 1\n" +
            "FRAME FULL [org/apache/hadoop/mapred/split/TezMapredSplitsGrouper org/apache/hadoop/conf/Configuration [Lorg/apache/hadoop/mapred/InputSplit; I java/lang/String org/apache/hadoop/mapred/split/SplitSizeEstimator I java/lang/String java/lang/String [Ljava/lang/String; I J java/util/Map [Lorg/apache/hadoop/mapred/InputSplit; T T T T T T T T I] []\n" +
            "FRAME FULL [org/apache/hadoop/mapred/split/TezMapredSplitsGrouper org/apache/hadoop/conf/Configuration [Lorg/apache/hadoop/mapred/InputSplit; I java/lang/String org/apache/hadoop/mapred/split/SplitSizeEstimator I java/lang/String java/lang/String [Ljava/lang/String; I J java/util/Map] []\n" +
            "LSTORE 23\n" +
            "ISTORE 25\n" +
            "ILOAD 25\n" +
            "ISTORE 30\n" +
            "ISTORE 27\n" +
            "ASTORE 31\n" +
            "FRAME FULL [org/apache/hadoop/mapred/split/TezMapredSplitsGrouper org/apache/hadoop/conf/Configuration [Lorg/apache/hadoop/mapred/InputSplit; I java/lang/String org/apache/hadoop/mapred/split/SplitSizeEstimator I java/lang/String java/lang/String [Ljava/lang/String; I J java/util/Map java/util/List T T T T T T T T J I T I T T I java/util/Iterator] []\n" +
            "ALOAD 31\n" +
            "ALOAD 31\n" +
            "ILOAD 30\n" +
            "ASTORE 31\n" +
            "ISTORE 32\n" +
            "FRAME FULL [org/apache/hadoop/mapred/split/TezMapredSplitsGrouper org/apache/hadoop/conf/Configuration [Lorg/apache/hadoop/mapred/InputSplit; I java/lang/String org/apache/hadoop/mapred/split/SplitSizeEstimator I java/lang/String java/lang/String [Ljava/lang/String; I J java/util/Map java/util/List T T T T T T [Lorg/apache/hadoop/mapred/InputSplit; I J I T I T T I java/util/Set I] []\n" +
            "ILOAD 32\n" +
            "ILOAD 32\n" +
            "ASTORE 33\n" +
            "ALOAD 31\n" +
            "ALOAD 33\n" +
            "ASTORE 34\n" +
            "ALOAD 33\n" +
            "ASTORE 35\n" +
            "ALOAD 35\n" +
            "ALOAD 35\n" +
            "ASTORE 35\n" +
            "ALOAD 35\n" +
            "ASTORE 36\n" +
            "ALOAD 36\n" +
            "ISTORE 37\n" +
            "ISTORE 38\n" +
            "ILOAD 38\n" +
            "ILOAD 37\n" +
            "ALOAD 36\n" +
            "ILOAD 38\n" +
            "ASTORE 24\n" +
            "ALOAD 24\n" +
            "ASTORE 24\n" +
            "FRAME FULL [org/apache/hadoop/mapred/split/TezMapredSplitsGrouper org/apache/hadoop/conf/Configuration [Lorg/apache/hadoop/mapred/InputSplit; I java/lang/String org/apache/hadoop/mapred/split/SplitSizeEstimator I java/lang/String java/lang/String [Ljava/lang/String; I J java/util/Map java/util/List T T T T T T [Lorg/apache/hadoop/mapred/InputSplit; I J java/lang/String I T I T T I java/util/Set I org/apache/hadoop/mapred/InputSplit org/apache/hadoop/mapred/split/TezMapredSplitsGrouper$SplitHolder [Ljava/lang/String; [Ljava/lang/String; I I] []\n" +
            "ALOAD 31\n" +
            "ALOAD 24\n" +
            "IINC 38 1\n" +
            "FRAME FULL [org/apache/hadoop/mapred/split/TezMapredSplitsGrouper org/apache/hadoop/conf/Configuration [Lorg/apache/hadoop/mapred/InputSplit; I java/lang/String org/apache/hadoop/mapred/split/SplitSizeEstimator I java/lang/String java/lang/String [Ljava/lang/String; I J java/util/Map java/util/List T T T T T T [Lorg/apache/hadoop/mapred/InputSplit; I J I T I T T I java/util/Set I org/apache/hadoop/mapred/InputSplit org/apache/hadoop/mapred/split/TezMapredSplitsGrouper$SplitHolder [Ljava/lang/String;] []\n" +
            "ALOAD 31\n" +
            "ASTORE 36\n" +
            "ALOAD 36\n" +
            "ALOAD 36\n" +
            "ASTORE 37\n" +
            "ALOAD 37\n" +
            "ASTORE 38\n" +
            "ALOAD 38\n" +
            "ALOAD 34\n" +
            "FRAME FULL [org/apache/hadoop/mapred/split/TezMapredSplitsGrouper org/apache/hadoop/conf/Configuration [Lorg/apache/hadoop/mapred/InputSplit; I java/lang/String org/apache/hadoop/mapred/split/SplitSizeEstimator I java/lang/String java/lang/String [Ljava/lang/String; I J java/util/Map java/util/List T T T T T T [Lorg/apache/hadoop/mapred/InputSplit; I J I T I T T I java/util/Set I] []\n" +
            "IINC 32 1\n" +
            "FRAME FULL [org/apache/hadoop/mapred/split/TezMapredSplitsGrouper org/apache/hadoop/conf/Configuration [Lorg/apache/hadoop/mapred/InputSplit; I java/lang/String org/apache/hadoop/mapred/split/SplitSizeEstimator I java/lang/String java/lang/String [Ljava/lang/String; I J java/util/Map java/util/List T T T T T T T T J I T I T T I java/util/Set] []\n" +
            "FRAME FULL [org/apache/hadoop/mapred/split/TezMapredSplitsGrouper org/apache/hadoop/conf/Configuration [Lorg/apache/hadoop/mapred/InputSplit; I java/lang/String org/apache/hadoop/mapred/split/SplitSizeEstimator I java/lang/String java/lang/String [Ljava/lang/String; I J java/util/Map java/util/List T T T T T T I I J I T I T T I java/util/Set] []\n" +
            "LLOAD 23\n" +
            "ILOAD 25\n" +
            "ILOAD 30\n" +
            "ILOAD 27\n" +
            "ISTORE 32\n" +
            "ILOAD 27\n" +
            "ASTORE 33\n" +
            "ASTORE 34\n" +
            "ISTORE 35\n" +
            "ISTORE 36\n" +
            "ISTORE 37\n" +
            "FRAME FULL [org/apache/hadoop/mapred/split/TezMapredSplitsGrouper org/apache/hadoop/conf/Configuration [Lorg/apache/hadoop/mapred/InputSplit; I java/lang/String org/apache/hadoop/mapred/split/SplitSizeEstimator I java/lang/String java/lang/String [Ljava/lang/String; I J java/util/Map java/util/List T T T T T T I I J I T I T T I java/util/Set I java/util/List java/util/Set I I I] []\n" +
            "ILOAD 32\n" +
            "IINC 37 1\n" +
            "ISTORE 38\n" +
            "ASTORE 24\n" +
            "FRAME FULL [org/apache/hadoop/mapred/split/TezMapredSplitsGrouper org/apache/hadoop/conf/Configuration [Lorg/apache/hadoop/mapred/InputSplit; I java/lang/String org/apache/hadoop/mapred/split/SplitSizeEstimator I java/lang/String java/lang/String [Ljava/lang/String; I J java/util/Map java/util/List T T T T T T I I J java/util/Iterator I T I T T I java/util/Set I java/util/List java/util/Set I I I I] []\n" +
            "ALOAD 24\n" +
            "ALOAD 24\n" +
            "ASTORE 39\n" +
            "ALOAD 33\n" +
            "ALOAD 34\n" +
            "ALOAD 39\n" +
            "ASTORE 26\n" +
            "ALOAD 39\n" +
            "ASTORE 40\n" +
            "ALOAD 40\n" +
            "ASTORE 28\n" +
            "ALOAD 28\n" +
            "FRAME FULL [org/apache/hadoop/mapred/split/TezMapredSplitsGrouper org/apache/hadoop/conf/Configuration [Lorg/apache/hadoop/mapred/InputSplit; I java/lang/String org/apache/hadoop/mapred/split/SplitSizeEstimator I java/lang/String java/lang/String [Ljava/lang/String; I J java/util/Map java/util/List T T T T T T I I J java/util/Iterator I java/lang/String I org/apache/hadoop/mapred/split/TezMapredSplitsGrouper$SplitHolder T I java/util/Set I java/util/List java/util/Set I I I I java/util/Map$Entry org/apache/hadoop/mapred/split/TezMapredSplitsGrouper$LocationHolder] []\n" +
            "ALOAD 40\n" +
            "ISTORE 41\n" +
            "LSTORE 42\n" +
            "ISTORE 44\n" +
            "ALOAD 33\n" +
            "ALOAD 28\n" +
            "LLOAD 42\n" +
            "ALOAD 28\n" +
            "LSTORE 42\n" +
            "IINC 44 1\n" +
            "ALOAD 40\n" +
            "ALOAD 40\n" +
            "ASTORE 28\n" +
            "ALOAD 28\n" +
            "LLOAD 42\n" +
            "ALOAD 28\n" +
            "LLOAD 23\n" +
            "ILOAD 44\n" +
            "ILOAD 27\n" +
            "ALOAD 40\n" +
            "ILOAD 35\n" +
            "LLOAD 42\n" +
            "LLOAD 23\n" +
            "ILOAD 44\n" +
            "ILOAD 27\n" +
            "ALOAD 40\n" +
            "ILOAD 41\n" +
            "IINC 38 1\n" +
            "ALOAD 26\n" +
            "ASTORE 45\n" +
            "ALOAD 26\n" +
            "ASTORE 45\n" +
            "ILOAD 36\n" +
            "ALOAD 33\n" +
            "ASTORE 46\n" +
            "ALOAD 46\n" +
            "ALOAD 46\n" +
            "ASTORE 47\n" +
            "ALOAD 47\n" +
            "ASTORE 48\n" +
            "ALOAD 48\n" +
            "ALOAD 48\n" +
            "ASTORE 49\n" +
            "ALOAD 49\n" +
            "ISTORE 50\n" +
            "ISTORE 51\n" +
            "FRAME FULL [org/apache/hadoop/mapred/split/TezMapredSplitsGrouper org/apache/hadoop/conf/Configuration [Lorg/apache/hadoop/mapred/InputSplit; I java/lang/String org/apache/hadoop/mapred/split/SplitSizeEstimator I java/lang/String java/lang/String [Ljava/lang/String; I J java/util/Map java/util/List T T T T T T I I J java/util/Iterator I java/lang/String I org/apache/hadoop/mapred/split/TezMapredSplitsGrouper$SplitHolder T I java/util/Set I java/util/List java/util/Set I I I I java/util/Map$Entry org/apache/hadoop/mapred/split/TezMapredSplitsGrouper$LocationHolder I J I [Ljava/lang/String; java/util/Iterator org/apache/hadoop/mapred/split/TezMapredSplitsGrouper$SplitHolder [Ljava/lang/String; [Ljava/lang/String; I I] []\n" +
            "ILOAD 51\n" +
            "ILOAD 50\n" +
            "ALOAD 49\n" +
            "ILOAD 51\n" +
            "ASTORE 52\n" +
            "ALOAD 52\n" +
            "ALOAD 34\n" +
            "ALOAD 52\n" +
            "IINC 51 1\n" +
            "FRAME FULL [org/apache/hadoop/mapred/split/TezMapredSplitsGrouper org/apache/hadoop/conf/Configuration [Lorg/apache/hadoop/mapred/InputSplit; I java/lang/String org/apache/hadoop/mapred/split/SplitSizeEstimator I java/lang/String java/lang/String [Ljava/lang/String; I J java/util/Map java/util/List T T T T T T I I J java/util/Iterator I java/lang/String I org/apache/hadoop/mapred/split/TezMapredSplitsGrouper$SplitHolder T I java/util/Set I java/util/List java/util/Set I I I I java/util/Map$Entry org/apache/hadoop/mapred/split/TezMapredSplitsGrouper$LocationHolder I J I [Ljava/lang/String; java/util/Iterator] []\n" +
            "ALOAD 34\n" +
            "ALOAD 45\n" +
            "ASTORE 45\n" +
            "ALOAD 33\n" +
            "ALOAD 45\n" +
            "ILOAD 36\n" +
            "ALOAD 26\n" +
            "ALOAD 26\n" +
            "FRAME FULL [org/apache/hadoop/mapred/split/TezMapredSplitsGrouper org/apache/hadoop/conf/Configuration [Lorg/apache/hadoop/mapred/InputSplit; I java/lang/String org/apache/hadoop/mapred/split/SplitSizeEstimator I java/lang/String java/lang/String [Ljava/lang/String; I J java/util/Map java/util/List T T T T T T I I J java/util/Iterator I java/lang/String I org/apache/hadoop/mapred/split/TezMapredSplitsGrouper$SplitHolder T I java/util/Set I java/util/List java/util/Set I I I I java/util/Map$Entry org/apache/hadoop/mapred/split/TezMapredSplitsGrouper$LocationHolder I J I [Ljava/lang/String;] [L144 L144 I java/lang/String [Ljava/lang/String;]\n" +
            "FRAME FULL [org/apache/hadoop/mapred/split/TezMapredSplitsGrouper org/apache/hadoop/conf/Configuration [Lorg/apache/hadoop/mapred/InputSplit; I java/lang/String org/apache/hadoop/mapred/split/SplitSizeEstimator I java/lang/String java/lang/String [Ljava/lang/String; I J java/util/Map java/util/List T T T T T T I I J java/util/Iterator I java/lang/String I org/apache/hadoop/mapred/split/TezMapredSplitsGrouper$SplitHolder T I java/util/Set I java/util/List java/util/Set I I I I java/util/Map$Entry org/apache/hadoop/mapred/split/TezMapredSplitsGrouper$LocationHolder I J I [Ljava/lang/String;] [L144 L144 I java/lang/String [Ljava/lang/String; java/lang/String]\n" +
            "ASTORE 46\n" +
            "ALOAD 33\n" +
            "ASTORE 47\n" +
            "ALOAD 47\n" +
            "ALOAD 47\n" +
            "ASTORE 48\n" +
            "ALOAD 46\n" +
            "ALOAD 48\n" +
            "ALOAD 48\n" +
            "ALOAD 26\n" +
            "ALOAD 48\n" +
            "IINC 32 1\n" +
            "ALOAD 33\n" +
            "ALOAD 46\n" +
            "ALOAD 26\n" +
            "ALOAD 46\n" +
            "FRAME FULL [org/apache/hadoop/mapred/split/TezMapredSplitsGrouper org/apache/hadoop/conf/Configuration [Lorg/apache/hadoop/mapred/InputSplit; I java/lang/String org/apache/hadoop/mapred/split/SplitSizeEstimator I java/lang/String java/lang/String [Ljava/lang/String; I J java/util/Map java/util/List T T T T T T I I J I T I T T I java/util/Set I java/util/List java/util/Set I I I I] []\n" +
            "ILOAD 36\n" +
            "ILOAD 38\n" +
            "ISTORE 36\n" +
            "ILOAD 32\n" +
            "ISTORE 24\n" +
            "ILOAD 24\n" +
            "ASTORE 39\n" +
            "ASTORE 26\n" +
            "FRAME FULL [org/apache/hadoop/mapred/split/TezMapredSplitsGrouper org/apache/hadoop/conf/Configuration [Lorg/apache/hadoop/mapred/InputSplit; I java/lang/String org/apache/hadoop/mapred/split/SplitSizeEstimator I java/lang/String java/lang/String [Ljava/lang/String; I J java/util/Map java/util/List T T T T T T I I J I I java/util/Iterator I T T I java/util/Set I java/util/List java/util/Set I I I I java/util/Set] []\n" +
            "ALOAD 26\n" +
            "ALOAD 26\n" +
            "ASTORE 40\n" +
            "ALOAD 40\n" +
            "ASTORE 28\n" +
            "FRAME FULL [org/apache/hadoop/mapred/split/TezMapredSplitsGrouper org/apache/hadoop/conf/Configuration [Lorg/apache/hadoop/mapred/InputSplit; I java/lang/String org/apache/hadoop/mapred/split/SplitSizeEstimator I java/lang/String java/lang/String [Ljava/lang/String; I J java/util/Map java/util/List T T T T T T I I J I I java/util/Iterator I org/apache/hadoop/mapred/split/TezMapredSplitsGrouper$LocationHolder T I java/util/Set I java/util/List java/util/Set I I I I java/util/Set java/util/Map$Entry] []\n" +
            "ALOAD 28\n" +
            "ALOAD 28\n" +
            "ASTORE 41\n" +
            "ALOAD 41\n" +
            "ALOAD 39\n" +
            "ALOAD 41\n" +
            "ALOAD 28\n" +
            "FRAME FULL [org/apache/hadoop/mapred/split/TezMapredSplitsGrouper org/apache/hadoop/conf/Configuration [Lorg/apache/hadoop/mapred/InputSplit; I java/lang/String org/apache/hadoop/mapred/split/SplitSizeEstimator I java/lang/String java/lang/String [Ljava/lang/String; I J java/util/Map java/util/List T T T T T T I I J I I java/util/Iterator I T T I java/util/Set I java/util/List java/util/Set I I I I java/util/Set] []\n" +
            "FRAME FULL [org/apache/hadoop/mapred/split/TezMapredSplitsGrouper org/apache/hadoop/conf/Configuration [Lorg/apache/hadoop/mapred/InputSplit; I java/lang/String org/apache/hadoop/mapred/split/SplitSizeEstimator I java/lang/String java/lang/String [Ljava/lang/String; I J java/util/Map java/util/List T T T T T T I I J I I T I T T I java/util/Set I java/util/List java/util/Set I I I I java/util/Set] []\n" +
            "ALOAD 39\n" +
            "ILOAD 24\n" +
            "ILOAD 24\n" +
            "ALOAD 39\n" +
            "ASTORE 26\n" +
            "ASTORE 40\n" +
            "ASTORE 28\n" +
            "FRAME FULL [org/apache/hadoop/mapred/split/TezMapredSplitsGrouper org/apache/hadoop/conf/Configuration [Lorg/apache/hadoop/mapred/InputSplit; I java/lang/String org/apache/hadoop/mapred/split/SplitSizeEstimator I java/lang/String java/lang/String [Ljava/lang/String; I J java/util/Map java/util/List T T T T T T I I J I I java/util/Map I java/util/Iterator T I java/util/Set I java/util/List java/util/Set I I I I java/util/Set java/util/Map] []\n" +
            "ALOAD 28\n" +
            "ALOAD 28\n" +
            "ASTORE 41\n" +
            "ASTORE 42\n" +
            "ALOAD 41\n" +
            "ALOAD 41\n" +
            "ASTORE 42\n" +
            "ALOAD 26\n" +
            "ALOAD 41\n" +
            "ALOAD 42\n" +
            "ALOAD 40\n" +
            "ALOAD 42\n" +
            "ALOAD 40\n" +
            "ALOAD 42\n" +
            "ILOAD 24\n" +
            "FRAME FULL [org/apache/hadoop/mapred/split/TezMapredSplitsGrouper org/apache/hadoop/conf/Configuration [Lorg/apache/hadoop/mapred/InputSplit; I java/lang/String org/apache/hadoop/mapred/split/SplitSizeEstimator I java/lang/String java/lang/String [Ljava/lang/String; I J java/util/Map java/util/List T T T T T T I I J I I java/util/Map I T T I java/util/Set I java/util/List java/util/Set I I I I java/util/Set java/util/Map] []\n" +
            "ALOAD 40\n" +
            "ASTORE 28\n" +
            "ALOAD 39\n" +
            "ISTORE 41\n" +
            "ASTORE 42\n" +
            "ALOAD 42\n" +
            "ISTORE 53\n" +
            "ISTORE 44\n" +
            "FRAME FULL [org/apache/hadoop/mapred/split/TezMapredSplitsGrouper org/apache/hadoop/conf/Configuration [Lorg/apache/hadoop/mapred/InputSplit; I java/lang/String org/apache/hadoop/mapred/split/SplitSizeEstimator I java/lang/String java/lang/String [Ljava/lang/String; I J java/util/Map java/util/List T T T T T T I I J I I java/util/Map I java/util/HashSet T I java/util/Set I java/util/List java/util/Set I I I I java/util/Set java/util/Map I [Lorg/apache/hadoop/mapred/InputSplit; T I T T T T T T T T I] []\n" +
            "ILOAD 44\n" +
            "ILOAD 53\n" +
            "ALOAD 42\n" +
            "ILOAD 44\n" +
            "ASTORE 45\n" +
            "ILOAD 41\n" +
            "FRAME FULL [org/apache/hadoop/mapred/split/TezMapredSplitsGrouper org/apache/hadoop/conf/Configuration [Lorg/apache/hadoop/mapred/InputSplit; I java/lang/String org/apache/hadoop/mapred/split/SplitSizeEstimator I java/lang/String java/lang/String [Ljava/lang/String; I J java/util/Map java/util/List T T T T T T I I J I I java/util/Map I java/util/HashSet T I java/util/Set I java/util/List java/util/Set I I I I java/util/Set java/util/Map I [Lorg/apache/hadoop/mapred/InputSplit; T I org/apache/hadoop/mapred/InputSplit T T T T T T T I] []\n" +
            "ALOAD 45\n" +
            "IINC 41 -1\n" +
            "ALOAD 28\n" +
            "ALOAD 45\n" +
            "ASTORE 46\n" +
            "ALOAD 45\n" +
            "ASTORE 47\n" +
            "ALOAD 47\n" +
            "ALOAD 47\n" +
            "FRAME FULL [org/apache/hadoop/mapred/split/TezMapredSplitsGrouper org/apache/hadoop/conf/Configuration [Lorg/apache/hadoop/mapred/InputSplit; I java/lang/String org/apache/hadoop/mapred/split/SplitSizeEstimator I java/lang/String java/lang/String [Ljava/lang/String; I J java/util/Map java/util/List T T T T T T I I J I I java/util/Map I java/util/HashSet T I java/util/Set I java/util/List java/util/Set I I I I java/util/Set java/util/Map I [Lorg/apache/hadoop/mapred/InputSplit; T I org/apache/hadoop/mapred/InputSplit org/apache/hadoop/mapred/split/TezMapredSplitsGrouper$SplitHolder [Ljava/lang/String; T T T T T I] []\n" +
            "ASTORE 47\n" +
            "ALOAD 47\n" +
            "ASTORE 48\n" +
            "ALOAD 48\n" +
            "ISTORE 49\n" +
            "ISTORE 50\n" +
            "FRAME FULL [org/apache/hadoop/mapred/split/TezMapredSplitsGrouper org/apache/hadoop/conf/Configuration [Lorg/apache/hadoop/mapred/InputSplit; I java/lang/String org/apache/hadoop/mapred/split/SplitSizeEstimator I java/lang/String java/lang/String [Ljava/lang/String; I J java/util/Map java/util/List T T T T T T I I J I I java/util/Map I java/util/HashSet T I java/util/Set I java/util/List java/util/Set I I I I java/util/Set java/util/Map I [Lorg/apache/hadoop/mapred/InputSplit; T I org/apache/hadoop/mapred/InputSplit org/apache/hadoop/mapred/split/TezMapredSplitsGrouper$SplitHolder [Ljava/lang/String; [Ljava/lang/String; I I T T I] []\n" +
            "ILOAD 50\n" +
            "ILOAD 49\n" +
            "ALOAD 48\n" +
            "ILOAD 50\n" +
            "ASTORE 51\n" +
            "ALOAD 51\n" +
            "ASTORE 51\n" +
            "FRAME FULL [org/apache/hadoop/mapred/split/TezMapredSplitsGrouper org/apache/hadoop/conf/Configuration [Lorg/apache/hadoop/mapred/InputSplit; I java/lang/String org/apache/hadoop/mapred/split/SplitSizeEstimator I java/lang/String java/lang/String [Ljava/lang/String; I J java/util/Map java/util/List T T T T T T I I J I I java/util/Map I java/util/HashSet T I java/util/Set I java/util/List java/util/Set I I I I java/util/Set java/util/Map I [Lorg/apache/hadoop/mapred/InputSplit; T I org/apache/hadoop/mapred/InputSplit org/apache/hadoop/mapred/split/TezMapredSplitsGrouper$SplitHolder [Ljava/lang/String; [Ljava/lang/String; I I java/lang/String T I] []\n" +
            "ALOAD 28\n" +
            "ALOAD 26\n" +
            "ALOAD 51\n" +
            "IINC 50 1\n" +
            "FRAME FULL [org/apache/hadoop/mapred/split/TezMapredSplitsGrouper org/apache/hadoop/conf/Configuration [Lorg/apache/hadoop/mapred/InputSplit; I java/lang/String org/apache/hadoop/mapred/split/SplitSizeEstimator I java/lang/String java/lang/String [Ljava/lang/String; I J java/util/Map java/util/List T T T T T T I I J I I java/util/Map I java/util/HashSet T I java/util/Set I java/util/List java/util/Set I I I I java/util/Set java/util/Map I [Lorg/apache/hadoop/mapred/InputSplit; T I org/apache/hadoop/mapred/InputSplit org/apache/hadoop/mapred/split/TezMapredSplitsGrouper$SplitHolder [Ljava/lang/String; T T T T T I] []\n" +
            "ALOAD 28\n" +
            "ASTORE 48\n" +
            "FRAME FULL [org/apache/hadoop/mapred/split/TezMapredSplitsGrouper org/apache/hadoop/conf/Configuration [Lorg/apache/hadoop/mapred/InputSplit; I java/lang/String org/apache/hadoop/mapred/split/SplitSizeEstimator I java/lang/String java/lang/String [Ljava/lang/String; I J java/util/Map java/util/List T T T T T T I I J I I java/util/Map I java/util/HashSet T I java/util/Set I java/util/List java/util/Set I I I I java/util/Set java/util/Map I [Lorg/apache/hadoop/mapred/InputSplit; T I org/apache/hadoop/mapred/InputSplit org/apache/hadoop/mapred/split/TezMapredSplitsGrouper$SplitHolder [Ljava/lang/String; java/util/Iterator T T T T I] []\n" +
            "ALOAD 48\n" +
            "ALOAD 48\n" +
            "ASTORE 49\n" +
            "ALOAD 40\n" +
            "ALOAD 49\n" +
            "ALOAD 46\n" +
            "FRAME FULL [org/apache/hadoop/mapred/split/TezMapredSplitsGrouper org/apache/hadoop/conf/Configuration [Lorg/apache/hadoop/mapred/InputSplit; I java/lang/String org/apache/hadoop/mapred/split/SplitSizeEstimator I java/lang/String java/lang/String [Ljava/lang/String; I J java/util/Map java/util/List T T T T T T I I J I I java/util/Map I java/util/HashSet T I java/util/Set I java/util/List java/util/Set I I I I java/util/Set java/util/Map I [Lorg/apache/hadoop/mapred/InputSplit; T I T T T T T T T T I] []\n" +
            "IINC 44 1\n" +
            "FRAME FULL [org/apache/hadoop/mapred/split/TezMapredSplitsGrouper org/apache/hadoop/conf/Configuration [Lorg/apache/hadoop/mapred/InputSplit; I java/lang/String org/apache/hadoop/mapred/split/SplitSizeEstimator I java/lang/String java/lang/String [Ljava/lang/String; I J java/util/Map java/util/List T T T T T T I I J I I java/util/Map I java/util/HashSet T I java/util/Set I java/util/List java/util/Set I I I I java/util/Set java/util/Map I] []\n" +
            "ALOAD 39\n" +
            "ALOAD 40\n" +
            "FSTORE 42\n" +
            "FLOAD 42\n" +
            "LLOAD 23\n" +
            "FLOAD 42\n" +
            "LSTORE 54\n" +
            "ILOAD 27\n" +
            "FLOAD 42\n" +
            "ISTORE 45\n" +
            "LLOAD 54\n" +
            "LLOAD 54\n" +
            "LSTORE 23\n" +
            "FRAME FULL [org/apache/hadoop/mapred/split/TezMapredSplitsGrouper org/apache/hadoop/conf/Configuration [Lorg/apache/hadoop/mapred/InputSplit; I java/lang/String org/apache/hadoop/mapred/split/SplitSizeEstimator I java/lang/String java/lang/String [Ljava/lang/String; I J java/util/Map java/util/List T T T T T T I I J I I java/util/Map I java/util/HashSet T I java/util/Set I java/util/List java/util/Set I I I I java/util/Set java/util/Map I F T T I T T T T T T T T J] []\n" +
            "ILOAD 45\n" +
            "ILOAD 45\n" +
            "ISTORE 27\n" +
            "FRAME FULL [org/apache/hadoop/mapred/split/TezMapredSplitsGrouper org/apache/hadoop/conf/Configuration [Lorg/apache/hadoop/mapred/InputSplit; I java/lang/String org/apache/hadoop/mapred/split/SplitSizeEstimator I java/lang/String java/lang/String [Ljava/lang/String; I J java/util/Map java/util/List T T T T T T I I J I I java/util/Map I java/util/HashSet T I java/util/Set I java/util/List java/util/Set I I I I java/util/Set java/util/Map I F] []\n" +
            "ILOAD 37\n" +
            "ILOAD 32\n" +
            "ILOAD 38\n" +
            "LLOAD 23\n" +
            "ILOAD 27\n" +
            "FRAME FULL [org/apache/hadoop/mapred/split/TezMapredSplitsGrouper org/apache/hadoop/conf/Configuration [Lorg/apache/hadoop/mapred/InputSplit; I java/lang/String org/apache/hadoop/mapred/split/SplitSizeEstimator I java/lang/String java/lang/String [Ljava/lang/String; I J java/util/Map java/util/List T T T T T T I I J I T I T T I java/util/Set I java/util/List java/util/Set I I I I] []\n" +
            "ILOAD 35\n" +
            "ILOAD 38\n" +
            "ILOAD 25\n" +
            "ISTORE 35\n" +
            "ILOAD 37\n" +
            "ILOAD 32\n" +
            "ILOAD 38\n" +
            "ILOAD 37\n" +
            "ILOAD 32\n" +
            "ILOAD 38\n" +
            "ASTORE 38\n" +
            "ALOAD 38\n" +
            "ILOAD 32\n" +
            "ALOAD 38\n" +
            "LOCALVARIABLE lengthPerGroup J L42 L34 23\n" +
            "LOCALVARIABLE maxLengthPerGroup J L43 L34 25\n" +
            "LOCALVARIABLE minLengthPerGroup J L44 L34 27\n" +
            "LOCALVARIABLE newSplit Lorg/apache/hadoop/mapred/split/TezGroupedSplit; L68 L70 31\n" +
            "LOCALVARIABLE split Lorg/apache/hadoop/mapred/InputSplit; L66 L70 27\n" +
            "LOCALVARIABLE i I L63 L60 23\n" +
            "LOCALVARIABLE location Ljava/lang/String; L91 L94 24\n" +
            "LOCALVARIABLE holder Lorg/apache/hadoop/mapred/split/TezMapredSplitsGrouper$LocationHolder; L98 L99 38\n" +
            "LOCALVARIABLE location Ljava/lang/String; L97 L99 37\n" +
            "LOCALVARIABLE splitHolder Lorg/apache/hadoop/mapred/split/TezMapredSplitsGrouper$SplitHolder; L85 L96 34\n" +
            "LOCALVARIABLE locations [Ljava/lang/String; L86 L96 35\n" +
            "LOCALVARIABLE split Lorg/apache/hadoop/mapred/InputSplit; L83 L96 33\n" +
            "LOCALVARIABLE loc Ljava/lang/String; L153 L154 52\n" +
            "LOCALVARIABLE locations [Ljava/lang/String; L149 L150 48\n" +
            "LOCALVARIABLE splitH Lorg/apache/hadoop/mapred/split/TezMapredSplitsGrouper$SplitHolder; L148 L150 47\n" +
            "LOCALVARIABLE groupedSplitHolder Lorg/apache/hadoop/mapred/split/TezMapredSplitsGrouper$SplitHolder; L162 L168 48\n" +
            "LOCALVARIABLE location Ljava/lang/String; L120 L173 26\n" +
            "LOCALVARIABLE holder Lorg/apache/hadoop/mapred/split/TezMapredSplitsGrouper$LocationHolder; L121 L173 40\n" +
            "LOCALVARIABLE splitHolder Lorg/apache/hadoop/mapred/split/TezMapredSplitsGrouper$SplitHolder; L122 L173 28\n" +
            "LOCALVARIABLE oldHeadIndex I L125 L173 41\n" +
            "LOCALVARIABLE groupLength J L126 L173 42\n" +
            "LOCALVARIABLE groupNumSplits I L127 L173 44\n" +
            "LOCALVARIABLE groupLocation [Ljava/lang/String; L141 L173 45\n" +
            "LOCALVARIABLE groupedSplit Lorg/apache/hadoop/mapred/split/TezGroupedSplit; L159 L173 46\n" +
            "LOCALVARIABLE entry Ljava/util/Map$Entry; L117 L173 39\n" +
            "LOCALVARIABLE splitHolder Lorg/apache/hadoop/mapred/split/TezMapredSplitsGrouper$SplitHolder; L185 L186 41\n" +
            "LOCALVARIABLE locHolder Lorg/apache/hadoop/mapred/split/TezMapredSplitsGrouper$LocationHolder; L182 L183 28\n" +
            "LOCALVARIABLE entry Ljava/util/Map$Entry; L181 L183 40\n" +
            "LOCALVARIABLE rack Ljava/lang/String; L198 L202 42\n" +
            "LOCALVARIABLE location Ljava/lang/String; L197 L202 41\n" +
            "LOCALVARIABLE location Ljava/lang/String; L223 L226 51\n" +
            "LOCALVARIABLE rack Ljava/lang/String; L228 L229 49\n" +
            "LOCALVARIABLE splitHolder Lorg/apache/hadoop/mapred/split/TezMapredSplitsGrouper$SplitHolder; L217 L214 46\n" +
            "LOCALVARIABLE locations [Ljava/lang/String; L218 L214 47\n" +
            "LOCALVARIABLE split Lorg/apache/hadoop/mapred/InputSplit; L209 L214 45\n" +
            "LOCALVARIABLE newLengthPerGroup J L235 L233 54\n" +
            "LOCALVARIABLE newNumSplitsInGroup I L236 L233 45\n" +
            "LOCALVARIABLE numRemainingSplits I L177 L174 24\n" +
            "LOCALVARIABLE remainingSplits Ljava/util/Set; L178 L174 39\n" +
            "LOCALVARIABLE locToRackMap Ljava/util/Map; L193 L174 26\n" +
            "LOCALVARIABLE rackLocations Ljava/util/Map; L194 L174 40\n" +
            "LOCALVARIABLE rackSet Ljava/util/HashSet; L205 L174 28\n" +
            "LOCALVARIABLE numRackSplitsToGroup I L206 L174 41\n" +
            "LOCALVARIABLE rackSplitReduction F L232 L174 42\n" +
            "LOCALVARIABLE numFullGroupsCreated I L114 L248 38\n" +
            "LOCALVARIABLE lengthPerGroup J L72 L257 23\n" +
            "LOCALVARIABLE numNodeLocations I L73 L257 25\n" +
            "LOCALVARIABLE numSplitsPerLocation I L74 L257 30\n" +
            "LOCALVARIABLE numSplitsInGroup I L75 L257 27\n" +
            "LOCALVARIABLE locSet Ljava/util/Set; L80 L257 31\n" +
            "LOCALVARIABLE splitsProcessed I L105 L257 32\n" +
            "LOCALVARIABLE group Ljava/util/List; L106 L257 33\n" +
            "LOCALVARIABLE groupLocationSet Ljava/util/Set; L107 L257 34\n" +
            "LOCALVARIABLE allowSmallGroups Z L108 L257 35\n" +
            "LOCALVARIABLE doingRackLocal Z L109 L257 36\n" +
            "LOCALVARIABLE iterations I L110 L257 37\n" +
            "LOCALVARIABLE groupedSplits [Lorg/apache/hadoop/mapred/InputSplit; L252 L257 38\n" +
            "MAXLOCALS = 57",
            false);
  }
}
