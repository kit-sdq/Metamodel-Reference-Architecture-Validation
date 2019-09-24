cd "D:\eclipse_oxygen\ws-runtime-dissvali\data.bpmn.models\_ignore\Roman org"
$i = 0
get-childItem -recurse -File *.bpmn | ForEach-Object {
    $dir = "D:\eclipse_oxygen\ws-runtime-dissvali\data.bpmn.models\_ignore\Roman flat\$($i)"
    #write-host Dir: $dir
    $dest = "$($dir)\$($i).bpmn"
    #write-host Dest: $dest
    new-item -Path $dir -ItemType directory
    copy-item -Path $_.Fullname -Destination $dest
    $i = $i+1
}
