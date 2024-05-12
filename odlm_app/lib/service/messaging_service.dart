import 'package:firebase_messaging/firebase_messaging.dart';

class MessagingService {
  final FirebaseMessaging _messaging = FirebaseMessaging.instance;

  void setupForegroundNotificationListener() {
    _messaging.requestPermission(); // 권한 요청

    FirebaseMessaging.onMessage.listen((RemoteMessage message) {
      // 포그라운드에서 메시지가 수신될 때 실행됩니다.
      if (message.notification != null) {
        // 알림이 있을 경우, UI에 표시
        var notification = message.notification as RemoteNotification;
        print('Message also contained a notification: ${notification.body}');
      }
    });

    FirebaseMessaging.onMessageOpenedApp.listen((RemoteMessage message) {
      // 사용자가 알림을 탭하여 앱을 열었을 때
      print('Message clicked!');
    });
  }
}