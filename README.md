# Multibhashi SDK
This is a sample project which uses the Multibhashi SDK

## Download
This SDK is available via jCenter:  [ ![Download](https://api.bintray.com/packages/multibhashi/services/sdk/images/download.svg) ](https://bintray.com/multibhashi/services/sdk/_latestVersion)

For Gradle:

```
dependencies {
    compile 'com.multibhashi.services:sdk:0.1.4'
}
```


## Usage

Create a User with the necessary details

```
  User user = new User();
  user.setUserName("USER_NAME");
  user.setUserMobile("USER_MOBILE");
  user.setUserEmail("USER_EMAIL");
```


Use the Multibhashi.Builder to create a Multibhashi object:

```
  Mutltibhashi multibhashi = new Multibhashi.Builder(CLIENT_ID)
    .courseType(Multibhashi.CourseType.GENERAL)
    .user(user)
    .build();
```

Call start on the multibhashi object with a reference to the launching Activity

```
  multibhashi.start(ParentActivity.this);
```

Please make sure you replace the CLIENT_ID in the sample with the id provided to you.
