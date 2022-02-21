## Carrotory Plugin
![GitHub](https://img.shields.io/github/license/igomq/JavaCLIMusicPlayer)
![Java](https://img.shields.io/badge/JAVA-007396?style=flat-round&logo=java&logoColor=white)
[![Build Status](http://219.255.230.115:32777/buildStatus/icon?job=Carrotory)](http://219.255.230.115:32777/job/Carrotory/)
<br/>

## Why I made this plugin
- - -
몇몇 RPG류 게임들을 하다, 여기에 있는 기능들을 마인크래프트에서 구현할 수 있으면 재밌겠다는 생각을 했습니다. 물론, 캐릭터나 스킬같은건 구현하기 어렵더라도, 강화 기능같은것만이라도 구현하면 좋겠다 생각하여 이 플러그인을 제작하게 되었습니다.
<details>
    <summary>English Translation</summary>
    While playing some RPG-like games, I thought that it would be fun if the functions here could be implemented in Minecraft. Of course, even if it is difficult to implement characters or skills, I thought that it would be good to implement only reinforcement functions, so I made this plug-in.
</details>

## About
- - -
앞서 말했듯, 현재로써는 강화 기능(그마저도 개발중인 0.2.2 기준 완성되지도 못한)밖에 없는 마인크래프트 플러그인입니다.
만일 나중에 실력이 늘거나 시간이 남는다면, 그 시간동안 틈틈히 새로운 기능들을 개발해보겠습니다.

### Usage
**`` (Carrotory Plugin 0.2.2 기준) ``**<br/><br/>
![image](https://user-images.githubusercontent.com/48321102/154964336-db55296e-e732-439b-acd9-0a58f3378477.png)
<br/>Scroll(주문서) 제작 방법 (주요 매터리얼(사진에선 철)만 변경하면 문제 X)
<details>
    <summary>Scroll recipes</summary>
    공통 재료 (Shared Material) - Paper x3 <br/><br/>
    Basic Enchant Scroll : Iron Ingot x1 <br/>
    Advanced Enchant Scroll : Diamond x1 <br/>
    Ancient Enchant Scroll : Ancient Debris x1 <br/>  
    Powerful Enchant Scroll : Netherite Ingot x1 <br/>
    Basic Reinforce Scroll : Lapis Lazuli x1 <br/>
    Basic Multi Scroll : Gold Block x1 <br/>
    Advanced Multi Scroll : Diamond Block x1 <br/>
    Strongest Multi Scroll : Nether Star x1
</details>
<br/>

#### Enchanting Table GUI
![image](https://user-images.githubusercontent.com/48321102/154965354-f245d237-234d-422c-8828-ded3de9c56dd.png)
![image](https://user-images.githubusercontent.com/48321102/154965341-82e8211b-b07b-4224-ac68-8df193d4024c.png)
<br/> 인챈트테이블을 열면 기존과 다른 UI가 나옵니다. 빨간색 유리를 클릭하면 나갈 수 있고, 아무 아이템이나 클릭하면
그 아이템에 인챈트 효과가 부여됩니다.

<br/>

#### Anvil GUI

![image](https://user-images.githubusercontent.com/48321102/154965901-5e85ae28-afa8-4fe6-9712-eb4d42e2b855.png)
![image](https://user-images.githubusercontent.com/48321102/154965877-fd506c69-bdcd-4ff0-8e18-ca5db025126c.png)
<br/> 인챈팅과 비슷하게 다른 UI가 나오고, 빨간색 유리를 통해 나갈 수 있으며, 아이템을 클릭하면 Info/Info.java의 equipmentList Array에 '들어있는'
아이템만 강화가 됩니다. (아닐경우 오류 출력)
<br/> 이쪽은 단풍게임 별포스와 비슷하게 만들었습니다. 장비 종류/장비 강화 레벨에 따라 효과와 효과 수치가 달라지며,
강화를 하면 별로 강화 레벨이 표시됩니다.
<br/> (0.2.1.1, 0.2.2-dev1 기준) 강화를 진행하면 효과가 적용되지 않는 오류가 발견되었습니다.


## Goal
목표는 간단합니다. 이번해 여름방학이 되기 전까지 기본적인 강화와 인챈팅 시스템을 완벽하게 완료하고, 버전을 1.0이라는 굉장히 기분좋은 숫자로 바꾸며
이제서야 master branch에 시작 이후 변경이 되고, releases 탭에 빌드한 파일을 넣어 배포하는 것입니다.
<br/> 가장 개발하고싶은 기능을 말하자면, (강화/인챈팅 제외) 특정 아이템을 통하여 공격 혹은 다른 이벤트 발생시
새로운 기능을 추가하는, 그냥 스킬을 만들고싶습니다.