# DownloadService
使用okhttp,进行下载，开启服务测试
AsyncTask doInBackGround用于后台执行逻辑，onProgressUpdate 更新进度 onPostExecute用于结果的通知  execute 用于启动任务，在UI线程中调用，  
onPreExcute在execute执行后调用
