a:

PS C:\Users\fs\Desktop\SELab> git add .
[main bb1a010] Ui-fixes on main
commit bb1a010cdbbb1624fd8d871d5c7aef78cbfff43d (HEAD -> main)
Author: Shruthi <olladapushruthi@gmail.com>

    Ui-fixes on main

commit 716293cef8a6ae46f3a591f5c55efb845e5981c7 (origin/UI-fixes)
Author: Shruthi <olladapushruthi@gmail.com>
Date:   Mon Sep 22 11:05:10 2025 +0530

    Maven Project added to remote
PS C:\Users\fs\Desktop\SELab> git checkout "UI-fixes"
Switched to branch 'UI-fixes'
PS C:\Users\fs\Desktop\SELab> git add .
On branch UI-fixes
PS C:\Users\fs\Desktop\SELab> git log
commit e70c8a8ef6db1781ad0562e913be59928cd67910 (HEAD -> UI-fixes)
Author: Shruthi <olladapushruthi@gmail.com>
Date:   Mon Sep 22 11:26:00 2025 +0530

    UI fixes on UI-fixes

commit 716293cef8a6ae46f3a591f5c55efb845e5981c7 (origin/UI-fixes)
Author: Shruthi <olladapushruthi@gmail.com>
Date:   Mon Sep 22 11:05:10 2025 +0530

    Maven Project added to remote
PS C:\Users\fs\Desktop\SELab> git checkout "main"
Switched to branch 'main'
PS C:\Users\fs\Desktop\SELab> git reset --hard HEAD~1
HEAD is now at 716293c Maven Project added to remote

b: